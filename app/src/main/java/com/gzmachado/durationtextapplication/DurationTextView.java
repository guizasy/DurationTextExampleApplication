package com.gzmachado.durationtextapplication;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by gzmachado on 29/09/16.
 */

public class DurationTextView extends TextView {
    private static final String TEMPLATE = "Duração: <strong>%s</strong>";

    public DurationTextView(Context context, AttributeSet attrs) {
        super(context);
    }

    public void setDuration(float duration) {
        int durationInMinutes = Math.round(duration / 60);
        int hours = durationInMinutes / 60;
        int minutes = durationInMinutes % 60;

        String hourText = "";
        String minuteText = "";

        if (hours > 0) {
            hourText = hours + (hours == 1 ? "hora" : "horas");
        }

        if (minutes > 0) {
            minuteText = minutes + (minutes == 1 ? "minuto" : "minutos");
        }

        if (hours == 0 && minutes == 0) {
            minuteText = "menos que um minuto =(";
        }

        String durationText = String.format(TEMPLATE, hourText + minuteText);

        if (Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            setText(Html.fromHtml(durationText, Html.FROM_HTML_MODE_LEGACY), BufferType.SPANNABLE);
        } else {
            setText(Html.fromHtml(durationText), BufferType.SPANNABLE);
        }
    }
}
