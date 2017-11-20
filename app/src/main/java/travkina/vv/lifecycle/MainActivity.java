package travkina.vv.lifecycle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SecontActivity(View view){

     //  Intent intent = new Intent(this, Main2Activity.class); // Создаем новое намерение "открыть вторую активность" intent- намерение
     //   String text = ((Button)view).getText().toString();
     //   intent.putExtra("num", Integer.parseInt(text));//доложим еще чего-нибудь
     //   startActivity(intent);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://myitschool.ru"));
        startActivity(intent);

   }
}
