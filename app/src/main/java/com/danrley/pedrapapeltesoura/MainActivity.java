package com.danrley.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView opcao;
    TextView texto;
    String[] opcoes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         opcao = findViewById(R.id.imgEscolha);
         texto = findViewById(R.id.tvResultado);
         opcoes = new String[] {"pedra", "papel", "tesoura"};
    }
    public void pedraSelecionada(View view){
        String opcaoSelecionada = "pedra";
        this.opcaoSelecionada(opcaoSelecionada);
    }
    public void papelSelecionada(View view){
        String opcaoSelecionada = "papel";
        this.opcaoSelecionada(opcaoSelecionada);
    }
    public void tesouraSelecionada(View view){
        String opcaoSelecionada = "tesoura";
        this.opcaoSelecionada(opcaoSelecionada);
    }

    public void opcaoSelecionada(String opcaoSelecionada) {


        int opcaoAleatoria = new Random().nextInt(3);
        String opcaoApp = opcoes[opcaoAleatoria];
        switch (opcaoApp) {
            case "pedra":
                opcao.setImageResource(R.drawable.pedra);
                if (opcaoSelecionada == "papel") {
                    texto.setText("Você venceu");
                } else if (opcaoSelecionada == "pedra") {
                    texto.setText("Nenhum vencedor");
                } else {
                    texto.setText("Você perdeu");
                }
                break;
            case "papel":
                opcao.setImageResource(R.drawable.papel);
                if (opcaoSelecionada == "tesoura") {
                    texto.setText("Você venceu");
                } else if (opcaoSelecionada == "papel") {
                    texto.setText("Nenhum vencedor");
                } else {
                    texto.setText("Você perdeu");
                }
                break;
            case "tesoura":
                opcao.setImageResource(R.drawable.tesoura);
                if (opcaoSelecionada == "pedra") {
                    texto.setText("Você venceu");
                } else if (opcaoSelecionada == "tesoura") {
                    texto.setText("Nenhum vencedor");
                } else {
                    texto.setText("Você perdeu");
                }
                break;
        }
    }
}