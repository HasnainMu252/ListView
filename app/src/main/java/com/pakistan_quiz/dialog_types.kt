package com.pakistan_quiz

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class dialog_types : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dialog_types)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val FirstDialog = findViewById(R.id.FirstDialog) as Button
        val SecondDialog = findViewById(R.id.button2) as Button
        val thirdDialog = findViewById(R.id.button3) as Button


        val AddDiaglog = AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setIcon(R.drawable.add_contact)
            .setMessage("Do you want to add this contact ?")
            .setPositiveButton("yes") { _, _ ->
                Toast.makeText(this, "you added the contact successfully.", Toast.LENGTH_LONG)
                    .show()
            }
            .setNegativeButton("no") { _, _ ->
                Toast.makeText(this, "you dont want to add the contact", Toast.LENGTH_LONG).show()
            }.create()



        FirstDialog.setOnClickListener() {
            AddDiaglog.show()
        }


        val  option = arrayOf("first item","second item","third item")

        val singleChoose = AlertDialog.Builder(this)
            .setTitle("Chose the choose ")
            .setSingleChoiceItems(option,0){dialogInterFace,i ->
                Toast.makeText(this,"you accepted single choose ${option[i]}",Toast.LENGTH_LONG).show()

            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "you accepted the single choose", Toast.LENGTH_LONG)
                    .show()
            }
            .setNegativeButton("Decline") { _, _ ->
                Toast.makeText(this, "you dont acccepted the single choose", Toast.LENGTH_LONG).show()
            }.create()

        SecondDialog.setOnClickListener(){
            singleChoose.show()
        }


        val MultiChoose = AlertDialog.Builder(this)
            .setTitle("Choose the multiple options")
            .setMultiChoiceItems(option, booleanArrayOf(false,false,false)) {_,i,d ->
                if(d){

                Toast.makeText(this,"you choose this options ${option[i]}",Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this,"you Dont this options ${option[i]}",Toast.LENGTH_LONG).show()

                }

            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "you accepted the multi choose", Toast.LENGTH_LONG)
                    .show()
            }
            .setNegativeButton("Decline") { _, _ ->
                Toast.makeText(this, "you dont acccepted the Multi choose", Toast.LENGTH_LONG).show()
            }.create()


    }
}