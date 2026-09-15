package defpackage;

import android.os.Build;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class DelegatingImageSavedCallback {
    private static final File TuitionPaymentFragmentbindingInflater1;
    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static volatile DelegatingImageSavedCallback TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static volatile int b;
    private final int asBinder;
    private int d;
    private final boolean g;
    private final int notify;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f125a = true;
    private final AtomicBoolean asInterface = new AtomicBoolean(false);

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Build.VERSION.SDK_INT < 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Build.VERSION.SDK_INT >= 26;
        TuitionPaymentFragmentbindingInflater1 = new File("/proc/self/fd");
        b = -1;
    }

    public static DelegatingImageSavedCallback TuitionPaymentFragmentbindingInflater1() {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            synchronized (DelegatingImageSavedCallback.class) {
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new DelegatingImageSavedCallback();
                }
            }
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    DelegatingImageSavedCallback() {
        boolean z = true;
        if (Build.VERSION.SDK_INT == 26) {
            Iterator it = Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play").iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Build.MODEL.startsWith((String) it.next())) {
                    }
                } else if (Build.VERSION.SDK_INT == 27 && Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL)) {
                }
                z = false;
            }
        } else if (Build.VERSION.SDK_INT == 27) {
            z = false;
        }
        this.g = z;
        if (Build.VERSION.SDK_INT >= 28) {
            this.notify = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
            this.asBinder = 0;
        } else {
            this.notify = TypedValues.TransitionType.TYPE_DURATION;
            this.asBinder = 128;
        }
    }

    public final boolean b(int i, int i2, boolean z, boolean z2) {
        int i3;
        if (z && this.g && TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return (!TuitionPaymentFragmentspecialinlinedviewModeldefault1 || this.asInterface.get()) && !z2 && i >= (i3 = this.asBinder) && i2 >= i3 && TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        return false;
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        boolean z;
        int i;
        synchronized (this) {
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= 50) {
                this.d = 0;
                int length = TuitionPaymentFragmentbindingInflater1.list().length;
                if (b != -1) {
                    i = b;
                } else {
                    i = this.notify;
                }
                boolean z2 = ((long) length) < ((long) i);
                this.f125a = z2;
                if (!z2) {
                    Log.isLoggable("Downsampler", 5);
                }
            }
            z = this.f125a;
        }
        return z;
    }
}
