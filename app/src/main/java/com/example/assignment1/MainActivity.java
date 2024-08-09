package com.example.assignment1;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Bitmap bg;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        bg=Bitmap.createBitmap(720,1280,Bitmap.Config.RGB_565);
        img=findViewById(R.id.imageView);
        img.setImageBitmap(bg);
      //object for canvas and paint class
        Canvas canvas =new Canvas(bg);
        Paint paint=new Paint();
        Paint paint1=new Paint();
        Paint paint2=new Paint();

        paint.setColor(Color.BLUE);
        paint1.setColor(Color.YELLOW);
        paint2.setColor(Color.GREEN);

        paint.setTextSize(50);
        paint1.setTextSize(60);

        // to draw Rectangle
        canvas.drawText("Rectangle",420,150,paint1);
        canvas.drawRect(400,200,650,700,paint);
        // to draw circle
        canvas.drawText("Circle",120,150,paint1);
        canvas.drawCircle(200,350,150,paint2);
        // to draw square
        canvas.drawText("Square",120,850,paint1);
        canvas.drawRect(50,850,350,1150,paint);
        // to draw Line
        canvas.drawText("Line",400,800,paint1);

        canvas.drawLine(520,850,520,1150,paint2);


    }
}