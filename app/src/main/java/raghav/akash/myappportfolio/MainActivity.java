package raghav.akash.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setBackgroundDrawable(null);
    setContentView(R.layout.activity_main);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    if (toolbar != null) {
      toolbar.setTitle("My App Portfolio");
      setSupportActionBar(toolbar);
    }
  }

  public void showMessageToast(View v) {
    Button button = (Button) v;
    Toast.makeText(this, button.getText() + " app Portfolio", Toast.LENGTH_SHORT).show();
  }
}
