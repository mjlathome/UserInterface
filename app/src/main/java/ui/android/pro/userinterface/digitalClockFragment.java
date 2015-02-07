package ui.android.pro.userinterface;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link digitalClockFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link digitalClockFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class digitalClockFragment extends Fragment {

    public digitalClockFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_digital, container, false);
    }

}
