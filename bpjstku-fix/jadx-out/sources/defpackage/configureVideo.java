package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class configureVideo extends Fragment {
    Map<String, PublishSubject<MediaSpec>> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new HashMap();
    boolean b;

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 42) {
            return;
        }
        boolean[] zArr = new boolean[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            zArr[i2] = shouldShowRequestPermissionRationale(strArr[i2]);
        }
        int length = strArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            PublishSubject<MediaSpec> publishSubject = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(strArr[i3]);
            if (publishSubject == null) {
                String str = outputFormatToAudioProfile.TuitionPaymentFragmentbindingInflater1;
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.remove(strArr[i3]);
            publishSubject.onNext(new MediaSpec(strArr[i3], iArr[i3] == 0, zArr[i3]));
            publishSubject.onComplete();
        }
    }
}
