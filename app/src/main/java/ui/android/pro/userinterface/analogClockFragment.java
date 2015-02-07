package ui.android.pro.userinterface;

import android.app.Activity;
import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AnalogClock;
import android.widget.Button;


/**
 * A simple {@link android.app.Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ui.android.pro.userinterface.analogClockFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ui.android.pro.userinterface.analogClockFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class analogClockFragment extends Fragment {

    Button happyButton;
    Button worldButton;
    Button clockButton;
    AnalogClock myAnalogClock;

    public analogClockFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater analogClock, ViewGroup analogClockLayout,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View analogClockView =
                analogClock.inflate(R.layout.activity_analog, analogClockLayout, false);

        // initialize UI objects
        myAnalogClock = (AnalogClock)analogClockView.findViewById(R.id.analogClock);
        happyButton = (Button)analogClockView.findViewById(R.id.happyClock);
        worldButton = (Button)analogClockView.findViewById(R.id.worldClock);
        clockButton = (Button)analogClockView.findViewById(R.id.simpleClock);

        // add event handlers
        happyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myAnalogClock.setBackgroundResource(R.drawable.analogclockhoop);
            }
        });

        worldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myAnalogClock.setBackgroundResource(R.drawable.worldclockhoop);
            }
        });

        clockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myAnalogClock.setBackgroundResource(R.drawable.goldclockhoop);
            }
        });

        return analogClockView;
        // was: return inflater.inflate(R.layout.activity_analog, container, false);
    }

}
