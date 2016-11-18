package com.example.andrewtakao.testapp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentTransaction;
import android.os.Bundle;

import java.util.Calendar;

/**
 * Created by andrewtakao on 10/26/16.
 */

public class PickerDialog extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog dialog;
        DateSettings dateSettings = new DateSettings(getActivity());
        dialog = new DatePickerDialog(getActivity(),dateSettings,year,month,day);
        return dialog;
    }

    @Override
    public int show(FragmentTransaction transaction, String tag) {
        return super.show(transaction, tag);
    }
}
