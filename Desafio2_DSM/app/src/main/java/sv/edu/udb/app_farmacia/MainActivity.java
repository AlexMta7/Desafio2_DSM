package sv.edu.udb.app_farmacia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView Image;
    private Button M1, M2, M3, M4, M5, M6, M7, M8, M9, M10;

    String N_Medi, Precio, Descuento, Tot, Desc;
    Double Pri, Des, Calculo, Total;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        M1 = (Button)findViewById(R.id.btn_M1);
        M2 = (Button)findViewById(R.id.btn_M2);
        M3 = (Button)findViewById(R.id.btn_M3);
        M4 = (Button)findViewById(R.id.btn_M4);
        M5 = (Button)findViewById(R.id.btn_M5);
        M6 = (Button)findViewById(R.id.btn_M6);
        M7 = (Button)findViewById(R.id.btn_M7);
        M8 = (Button)findViewById(R.id.btn_M8);
        M9 = (Button)findViewById(R.id.btn_M9);
        M10 = (Button)findViewById(R.id.btn_M10);


        //Colocando las imagenes en los ImageView
        Image = (ImageView)findViewById(R.id.ivImg1); Image.setImageResource(R.drawable.vgd);
        Image = (ImageView)findViewById(R.id.ivImg2); Image.setImageResource(R.drawable.vgn);
        Image = (ImageView)findViewById(R.id.ivImg3); Image.setImageResource(R.drawable.peto);
        Image = (ImageView)findViewById(R.id.ivImg4); Image.setImageResource(R.drawable.ceta);
        Image = (ImageView)findViewById(R.id.ivImg5); Image.setImageResource(R.drawable.pirina);
        Image = (ImageView)findViewById(R.id.ivImg6); Image.setImageResource(R.drawable.mepra);
        Image = (ImageView)findViewById(R.id.ivImg7); Image.setImageResource(R.drawable.curita);
        Image = (ImageView)findViewById(R.id.ivImg8); Image.setImageResource(R.drawable.dol);
        Image = (ImageView)findViewById(R.id.ivImg9); Image.setImageResource(R.drawable.cohol);
        Image = (ImageView)findViewById(R.id.ivImg10); Image.setImageResource(R.drawable.vic);

        M1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v){
                try {
                    N_Medi="Viro-Grip Día";
                    Precio="2.91";
                    Descuento="0.05";

                    //Haciendo calculos de descuento
                    Pri=Double.valueOf(Precio);
                    Des=Double.valueOf(Descuento);

                    Calculo= Pri * Des;

                    Total=Pri-Calculo;

                    //Convirtiendo a String valores a pasar

                    Tot = Total.toString();
                    Desc = Calculo.toString();

                    //Pasando los datos a la activity de orden de factura.

                    Intent intent = new Intent(MainActivity.this,InvoiceActivity.class);

                    intent.putExtra("Name_Medi",N_Medi);
                    intent.putExtra("Price",Precio);
                    intent.putExtra("Total",Tot);
                    intent.putExtra("Descu",Desc);

                    startActivity(intent);

                }catch (IllegalArgumentException e){
                    Toast.makeText(MainActivity.this, "Error: " + e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });

        M2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v){
                try {
                    N_Medi="Viro-Grip Noche";
                    Precio="2.47";
                    Descuento="0.05";

                    //Haciendo calculos de descuento
                    Pri=Double.valueOf(Precio);
                    Des=Double.valueOf(Descuento);

                    Calculo= Pri * Des;

                    Total=Pri-Calculo;

                    //Convirtiendo a String valores a pasar

                    Tot = Total.toString();
                    Desc = Calculo.toString();

                    //Pasando los datos a la activity de orden de factura.

                    Intent intent = new Intent(MainActivity.this,InvoiceActivity.class);

                    intent.putExtra("Name_Medi",N_Medi);
                    intent.putExtra("Price",Precio);
                    intent.putExtra("Total",Tot);
                    intent.putExtra("Descu",Desc);

                    startActivity(intent);

                }catch (IllegalArgumentException e){
                    Toast.makeText(MainActivity.this, "Error: " + e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });

        M3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v){
                try {
                    N_Medi="Pepto Bismol";
                    Precio="7.05";
                    Descuento="0.15";

                    //Haciendo calculos de descuento
                    Pri=Double.valueOf(Precio);
                    Des=Double.valueOf(Descuento);

                    Calculo= Pri * Des;

                    Total=Pri-Calculo;

                    //Convirtiendo a String valores a pasar

                    Tot = Total.toString();
                    Desc = Calculo.toString();

                    //Pasando los datos a la activity de orden de factura.

                    Intent intent = new Intent(MainActivity.this,InvoiceActivity.class);

                    intent.putExtra("Name_Medi",N_Medi);
                    intent.putExtra("Price",Precio);
                    intent.putExtra("Total",Tot);
                    intent.putExtra("Descu",Desc);

                    startActivity(intent);

                }catch (IllegalArgumentException e){
                    Toast.makeText(MainActivity.this, "Error: " + e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });

        M4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v){
                try {
                    N_Medi="Acetaminofen";
                    Precio="1.88";
                    Descuento="0.05";

                    //Haciendo calculos de descuento
                    Pri=Double.valueOf(Precio);
                    Des=Double.valueOf(Descuento);

                    Calculo= Pri * Des;

                    Total=Pri-Calculo;

                    //Convirtiendo a String valores a pasar

                    Tot = Total.toString();
                    Desc = Calculo.toString();

                    //Pasando los datos a la activity de orden de factura.

                    Intent intent = new Intent(MainActivity.this,InvoiceActivity.class);

                    intent.putExtra("Name_Medi",N_Medi);
                    intent.putExtra("Price",Precio);
                    intent.putExtra("Total",Tot);
                    intent.putExtra("Descu",Desc);

                    startActivity(intent);

                }catch (IllegalArgumentException e){
                    Toast.makeText(MainActivity.this, "Error: " + e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });

        M5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v){
                try {
                    N_Medi="Aspirina";
                    Precio="2.40";
                    Descuento="0.05";

                    //Haciendo calculos de descuento
                    Pri=Double.valueOf(Precio);
                    Des=Double.valueOf(Descuento);

                    Calculo= Pri * Des;

                    Total=Pri-Calculo;

                    //Convirtiendo a String valores a pasar

                    Tot = Total.toString();
                    Desc = Calculo.toString();

                    //Pasando los datos a la activity de orden de factura.

                    Intent intent = new Intent(MainActivity.this,InvoiceActivity.class);

                    intent.putExtra("Name_Medi",N_Medi);
                    intent.putExtra("Price",Precio);
                    intent.putExtra("Total",Tot);
                    intent.putExtra("Descu",Desc);

                    startActivity(intent);

                }catch (IllegalArgumentException e){
                    Toast.makeText(MainActivity.this, "Error: " + e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });


        M6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v){
                try {
                    N_Medi="Omeprazol";
                    Precio="18.86";
                    Descuento="0.15";

                    //Haciendo calculos de descuento
                    Pri=Double.valueOf(Precio);
                    Des=Double.valueOf(Descuento);

                    Calculo= Pri * Des;

                    Total=Pri-Calculo;

                    //Convirtiendo a String valores a pasar

                    Tot = Total.toString();
                    Desc = Calculo.toString();

                    //Pasando los datos a la activity de orden de factura.

                    Intent intent = new Intent(MainActivity.this,InvoiceActivity.class);

                    intent.putExtra("Name_Medi",N_Medi);
                    intent.putExtra("Price",Precio);
                    intent.putExtra("Total",Tot);
                    intent.putExtra("Descu",Desc);

                    startActivity(intent);

                }catch (IllegalArgumentException e){
                    Toast.makeText(MainActivity.this, "Error: " + e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });


        M7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v){
                try {
                    N_Medi="Curitas";
                    Precio="1.73";
                    Descuento="0.05";

                    //Haciendo calculos de descuento
                    Pri=Double.valueOf(Precio);
                    Des=Double.valueOf(Descuento);

                    Calculo= Pri * Des;

                    Total=Pri-Calculo;

                    //Convirtiendo a String valores a pasar

                    Tot = Total.toString();
                    Desc = Calculo.toString();

                    //Pasando los datos a la activity de orden de factura.

                    Intent intent = new Intent(MainActivity.this,InvoiceActivity.class);

                    intent.putExtra("Name_Medi",N_Medi);
                    intent.putExtra("Price",Precio);
                    intent.putExtra("Total",Tot);
                    intent.putExtra("Descu",Desc);

                    startActivity(intent);

                }catch (IllegalArgumentException e){
                    Toast.makeText(MainActivity.this, "Error: " + e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });


        M8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v){
                try {
                    N_Medi="Dolo-Neurobión";
                    Precio="61.13";
                    Descuento="0.18";

                    //Haciendo calculos de descuento
                    Pri=Double.valueOf(Precio);
                    Des=Double.valueOf(Descuento);

                    Calculo= Pri * Des;

                    Total=Pri-Calculo;

                    //Convirtiendo a String valores a pasar

                    Tot = Total.toString();
                    Desc = Calculo.toString();

                    //Pasando los datos a la activity de orden de factura.

                    Intent intent = new Intent(MainActivity.this,InvoiceActivity.class);

                    intent.putExtra("Name_Medi",N_Medi);
                    intent.putExtra("Price",Precio);
                    intent.putExtra("Total",Tot);
                    intent.putExtra("Descu",Desc);

                    startActivity(intent);

                }catch (IllegalArgumentException e){
                    Toast.makeText(MainActivity.this, "Error: " + e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });


        M9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v){
                try {
                    N_Medi="Alcohol en gel";
                    Precio="14.55";
                    Descuento="0.10";

                    //Haciendo calculos de descuento
                    Pri=Double.valueOf(Precio);
                    Des=Double.valueOf(Descuento);

                    Calculo= Pri * Des;

                    Total=Pri-Calculo;

                    //Convirtiendo a String valores a pasar

                    Tot = Total.toString();
                    Desc = Calculo.toString();

                    //Pasando los datos a la activity de orden de factura.

                    Intent intent = new Intent(MainActivity.this,InvoiceActivity.class);

                    intent.putExtra("Name_Medi",N_Medi);
                    intent.putExtra("Price",Precio);
                    intent.putExtra("Total",Tot);
                    intent.putExtra("Descu",Desc);

                    startActivity(intent);

                }catch (IllegalArgumentException e){
                    Toast.makeText(MainActivity.this, "Error: " + e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });


        M10.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v){
                try {
                    N_Medi="Vick Vaporub";
                    Precio="12.66";
                    Descuento="0.12";

                    //Haciendo calculos de descuento
                    Pri=Double.valueOf(Precio);
                    Des=Double.valueOf(Descuento);

                    Calculo= Pri * Des;

                    Total=Pri-Calculo;

                    //Convirtiendo a String valores a pasar

                    Tot = Total.toString();
                    Desc = Calculo.toString();

                    //Pasando los datos a la activity de orden de factura.

                    Intent intent = new Intent(MainActivity.this,InvoiceActivity.class);

                    intent.putExtra("Name_Medi",N_Medi);
                    intent.putExtra("Price",Precio);
                    intent.putExtra("Total",Tot);
                    intent.putExtra("Descu",Desc);

                    startActivity(intent);

                }catch (IllegalArgumentException e){
                    Toast.makeText(MainActivity.this, "Error: " + e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}