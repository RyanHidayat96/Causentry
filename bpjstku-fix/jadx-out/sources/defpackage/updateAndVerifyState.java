package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class updateAndVerifyState {
    public static <T> T TuitionPaymentFragmentbindingInflater1(T t) {
        return t;
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b(str, 4800, obj));
        }
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b(str, obj, obj2, obj3));
        }
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static <T> T TuitionPaymentFragmentspecialinlinedviewModeldefault3(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, String str) {
        if (i < 0) {
            return CameraStateRegistryCameraRegistration.b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("negative size: ".concat(String.valueOf(i2)));
        }
        return CameraStateRegistryCameraRegistration.b("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, String str) {
        if (i < 0) {
            return CameraStateRegistryCameraRegistration.b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("negative size: ".concat(String.valueOf(i2)));
        }
        return CameraStateRegistryCameraRegistration.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static String TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(i2, i3, "end index");
        }
        return CameraStateRegistryCameraRegistration.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }
}
