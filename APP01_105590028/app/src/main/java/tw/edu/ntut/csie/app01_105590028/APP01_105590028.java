package tw.edu.ntut.csie.app01_105590028;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class APP01_105590028 extends AppCompatActivity {
    private EditText mEdtInput;
    private Button mBtnbutton;
    private TextView mTxtscore, mEdta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app01_105590028);
        mEdtInput = (EditText) findViewById(R.id.editInput);
        mBtnbutton = (Button) findViewById(R.id.button2);
        mTxtscore = (TextView) findViewById(R.id.textView3);
        mEdta = (TextView) findViewById(R.id.textView4);

        mBtnbutton.setOnClickListener(button2OnClick);
    }
    private View.OnClickListener button2OnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
        letterGrade s =new letterGrade();
        int input=Integer.parseInt(mEdtInput.getText().toString());
        if(s.getSuggestion(input).equals("等第 : X")){
            mEdta.setText("輸入分數應介於[0..100]");
        }
        else{
            mEdta.setText(s.getSuggestion(input));
        }

        }
    };
}
