package viikko8.laskin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number1;
    private EditText number2;
    private TextView numberOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.editTextNumber1);
        number2 = findViewById(R.id.editTextNumber2);
        numberOutput = findViewById(R.id.textviewOutput);

    }

    public void clickButtonPlus(View view) {
        String number1String = number1.getText().toString();
        String number2String = number2.getText().toString();

        int number1int = Integer.parseInt(number1String);
        int number2int = Integer.parseInt(number2String);
        int number = number1int + number2int;
        numberOutput.setText(Integer.toString(number));
    }

    public void clickButtonMinus(View view) {
        String number1String = number1.getText().toString();
        String number2String = number2.getText().toString();

        int number1int = Integer.parseInt(number1String);
        int number2int = Integer.parseInt(number2String);
        int number = number1int - number2int;
        numberOutput.setText(Integer.toString(number));
    }

    public void clickButtonX(View view) {
        String number1String = number1.getText().toString();
        String number2String = number2.getText().toString();

        int number1int = Integer.parseInt(number1String);
        int number2int = Integer.parseInt(number2String);
        int number = number1int * number2int;
        numberOutput.setText(Integer.toString(number));
    }

    public void clickButtonDivision(View view) {
        String number1String = number1.getText().toString();
        String number2String = number2.getText().toString();

        int number1int = Integer.parseInt(number1String);
        int number2int = Integer.parseInt(number2String);
        int number = number1int / number2int;
        numberOutput.setText(Integer.toString(number));
    }
}