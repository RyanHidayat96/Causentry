package com.google.android.play.core.review;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import defpackage.CameraRepository;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ReviewException extends ApiException {
    /* JADX WARN: Illegal instructions before constructor call */
    public ReviewException() {
        String string;
        Locale locale = Locale.getDefault();
        Map map = CameraRepository.TuitionPaymentFragmentbindingInflater1;
        if (map.containsKey(-1)) {
            String str = (String) map.get(-1);
            String str2 = (String) CameraRepository.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(-1);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#");
            sb.append(str2);
            sb.append(")");
            string = sb.toString();
        } else {
            string = "";
        }
        super(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, string)));
    }
}
