package xyz.redbooks.kouluni.ui.user.attendance;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.redbooks.kouluni.R;

/**
 * A simple {@link Fragment} subclass.
 */

/**
 * Created by h4rdw1r3
 */

public class AttendanceFragment extends Fragment {


    public AttendanceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_attendance, container, false);
    }

}