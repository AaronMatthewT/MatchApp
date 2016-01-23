import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void secondNameFuncts(View view) {
        getIntent().putExtra("resultMessage", "You chose second name!");
        setResult(RESULT_OK, getIntent());
        Toast.makeText(this, "You chose second name!", Toast.LENGTH_SHORT).show();
    }

    public void firstNameFuncts(View view) {
        getIntent().putExtra("resultMessage", "You chose first name!");
        setResult(RESULT_OK, getIntent());
        Toast.makeText(this, "You chose first name!", Toast.LENGTH_SHORT).show();

        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        CheckBox checkBoxLast = (CheckBox) findViewById(R.id.checkBox5);
        if (checkBoxLast.isChecked()) {
            progressBar.setVisibility(View.VISIBLE);
        } else {
            progressBar.setVisibility(View.GONE);
        }
    }

    public void fullNamed(View view) {
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        CheckBox checkBoxLast = (CheckBox) findViewById(R.id.checkBox5);
        if (checkBoxLast.isChecked()) {
            progressBar.setVisibility(View.VISIBLE);
        } else {
            progressBar.setVisibility(View.GONE);
        }
    }


    public void buttonFuncts(View view) {
        EditText firstName = (EditText) findViewById(R.id.editText);
        EditText secondName = (EditText) findViewById(R.id.editText2);
        EditText lastName = (EditText) findViewById(R.id.editText3);
        TextView result = (TextView) findViewById(R.id.textView3);
        getIntent().putExtra("resultMessage", "You've activated your account named as: " + firstName + secondName);
        setResult(RESULT_OK, getIntent());
        Toast.makeText(this, "You've activated your account named as: " + firstName.getText() + " " + secondName.getText() + " " + lastName.getText(), Toast.LENGTH_LONG).show();

    }

    public void tvActivate(View view) {
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        EditText firstName = (EditText) findViewById(R.id.editText);
        EditText secondName = (EditText) findViewById(R.id.editText2);
        EditText lastName = (EditText) findViewById(R.id.editText3);
        TextView result = (TextView) findViewById(R.id.textView3);
        result.setText(" Signed in as " + firstName.getText() + " " + secondName.getText() + " " + lastName.getText());
        progressBar.setVisibility(View.GONE);
    }

    public void goToPics(View view) {
        Intent shiftActivity = new Intent(this, MyPics.class);
        startActivity(shiftActivity);
    }
}
