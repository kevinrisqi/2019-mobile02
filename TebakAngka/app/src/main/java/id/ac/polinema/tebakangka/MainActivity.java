package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	private EditText numberInput;
	private int random;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		numberInput = findViewById(R.id.number_input);
		initRandomNumber();
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {
		final int min = 20;
		final int max = 80;
		random = new Random().nextInt((max - min) + 1) + min;
	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		numberInput = Integer.valueOf(numberInput)
	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
	}
}
