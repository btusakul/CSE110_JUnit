package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.btusa_000.cse110_junit.MyActivity;
import com.example.btusa_000.cse110_junit.R;

/**
 * Created by btusa_000 on 4/15/2016.
 */

public class JUnit_Test extends ActivityInstrumentationTestCase2<MyActivity> {

    MyActivity myActivity;

    public JUnit_Test() {
        super(MyActivity.class);
    }

    public void test_first() {
        myActivity = getActivity();
        TextView textview = (TextView) myActivity.findViewById(R.id.smd);
        String tester = textview.getText().toString();
        assertEquals("Bye World",tester);
    }

}
