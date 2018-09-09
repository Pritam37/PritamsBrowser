package com.example.jesmin.pritamsbrowser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    Button btnGo,btnGoogle,btnFB,btnYtube,btnWiki,btnYahoo,btnGmail;
    TextView etxtURL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnGo=findViewById(R.id.btn_go);
        btnGoogle=findViewById(R.id.btn_google);
        btnFB=findViewById(R.id.btn_fb);
        btnYtube=findViewById(R.id.btn_ytube);
        btnWiki=findViewById(R.id.btn_wiki);
        btnYahoo=findViewById(R.id.btn_yahoo);
        btnGmail=findViewById(R.id.btn_gmail);
        etxtURL=findViewById(R.id.etxt_url);


        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url=etxtURL.getText().toString();
                if (url.isEmpty())
                {
                    Toast.makeText(HomeActivity.this, "Please Enter URL", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent=new Intent(HomeActivity.this,WebActivity.class);
                    intent.putExtra("url",url);
                    startActivity(intent);
                }
            }
        });
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,WebActivity.class);
                intent.putExtra("url", "www.google.com");
                startActivity(intent);
            }
        });
        btnFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this, WebActivity.class);
                intent.putExtra("url", "m.facebook.com");
                startActivity(intent);
            }
        });
        btnYtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this, WebActivity.class);
                intent.putExtra("url", "www.youtube.com");
                startActivity(intent);
            }
        });

        btnWiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this, WebActivity.class);
                intent.putExtra("url", "www.wikipedia.org");
                startActivity(intent);
            }
        });
        btnYahoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this, WebActivity.class);
                intent.putExtra("url", "www.yahoo.com");
                startActivity(intent);
            }
        });
        btnGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this, WebActivity.class);
                intent.putExtra("url", "www.gmail.com");
                startActivity(intent);
            }
        });
    }
}
