package com.example.artpoint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*



class MainActivity : AppCompatActivity() {
    lateinit var LogoutBtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        LogoutBtn= findViewById(R.id.logout_button)
        LogoutBtn.setOnClickListener {
            perfomLogout()
        }


        var listView=findViewById<ListView>(R.id.list_view)
        var list= mutableListOf<Model>()


        //adding images
        list.add(Model("Asian Princess @KSH 14500","Art by Navio-0712345678  ",R.drawable.artone))
        list.add(Model("Living Area @KSH 11000","Art by Schurrle-0712345678  ",R.drawable.arttwo))
        list.add(Model("Tiger @KSH 8500","Art by Cosmos-0712345678  ",R.drawable.artthree))
        list.add(Model("Flower @KSH 9000 ","Art by Sauron-0712345678 ",R.drawable.artfour))
        list.add(Model("Ying & Yang @KSH 10500","Art by Quagmire-0712345678  ",R.drawable.artfive))
        list.add(Model("Oceans @KSH 15000","Art by Adar-0712345678  ",R.drawable.artsix))
        list.add(Model("Nature @KSH 13000","Art by Morgoth-0712345678  ",R.drawable.artseven))
        list.add(Model("Beauty @KSH 20000"," Art by Cyn-0712345678 ",R.drawable.arteight))
        list.add(Model("Love @KSH 10500","Art by Scar-0712345678  ",R.drawable.artnine))
        list.add(Model("Serenity @KSH 11000","Art by Simpson-0712345678  ",R.drawable.artten))


        listView.adapter=MyAdapter(this,R.layout.row,list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id:Long ->

            if (position==0){
                val simToolKitLaunchIntent =
                    applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

                simToolKitLaunchIntent?.let { startActivity(it) }

            }
            if (position==1){
                val simToolKitLaunchIntent =
                    applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

                simToolKitLaunchIntent?.let { startActivity(it) }



            }
            if (position==2){
                val simToolKitLaunchIntent =
                    applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

                simToolKitLaunchIntent?.let { startActivity(it) }



            }
            if (position==3){
                val simToolKitLaunchIntent =
                    applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

                simToolKitLaunchIntent?.let { startActivity(it) }

            }
            if (position==4){
                val simToolKitLaunchIntent =
                    applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

                simToolKitLaunchIntent?.let { startActivity(it) }

            }
            if (position==5){
                val simToolKitLaunchIntent =
                    applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

                simToolKitLaunchIntent?.let { startActivity(it) }

            }
            if (position==6){
                val simToolKitLaunchIntent =
                    applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

                simToolKitLaunchIntent?.let { startActivity(it) }

            }
            if (position==7){
                val simToolKitLaunchIntent =
                    applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

                simToolKitLaunchIntent?.let { startActivity(it) }

            }
            if (position==8){
                val simToolKitLaunchIntent =
                    applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

                simToolKitLaunchIntent?.let { startActivity(it) }

            }
            if (position==9){
                val simToolKitLaunchIntent =
                    applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

                simToolKitLaunchIntent?.let { startActivity(it) }

            }
}
}

    private fun perfomLogout() {
        // Perform logout actions here, such as clearing any logged-in user data
        // and returning to the login screen.

        val loginIntent = Intent(this, LoginActivity::class.java)
        startActivity(loginIntent)
        Toast.makeText(this, "Successfully LoggedOut", Toast.LENGTH_SHORT).show()
        finish()
    }
}


