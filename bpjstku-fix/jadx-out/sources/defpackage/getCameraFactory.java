package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class getCameraFactory implements updateOrResetMinLogLevel {
    private static final Bitmap.Config[] TuitionPaymentFragmentbindingInflater1;
    private static final Bitmap.Config[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final Bitmap.Config[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final Bitmap.Config[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final Bitmap.Config[] b;
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault1 d = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    private final initInternal<TuitionPaymentFragmentbindingInflater1, Bitmap> asInterface = new initInternal<>();
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> asBinder = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = configArr;
        TuitionPaymentFragmentbindingInflater1 = configArr;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        b = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    @Override // defpackage.updateOrResetMinLogLevel
    public final void b(Bitmap bitmap) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bitmap);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.d;
        Bitmap.Config config = bitmap.getConfig();
        Object objTuitionPaymentFragmentbindingInflater1 = (updateQuirkSettings) tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.poll();
        if (objTuitionPaymentFragmentbindingInflater1 == null) {
            objTuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
        }
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) objTuitionPaymentFragmentbindingInflater1;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentbindingInflater1.b = config;
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentbindingInflater1, bitmap);
        NavigableMap<Integer, Integer> navigableMapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(bitmap.getConfig());
        Integer num = (Integer) navigableMapTuitionPaymentFragmentspecialinlinedviewModeldefault2.get(Integer.valueOf(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        navigableMapTuitionPaymentFragmentspecialinlinedviewModeldefault2.put(Integer.valueOf(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.updateOrResetMinLogLevel
    public final Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, Bitmap.Config config) throws Throwable {
        Bitmap.Config[] configArr;
        int iTuitionPaymentFragmentbindingInflater1 = getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(i, i2, config);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.d;
        Object objTuitionPaymentFragmentbindingInflater1 = (updateQuirkSettings) tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.poll();
        if (objTuitionPaymentFragmentbindingInflater1 == null) {
            objTuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
        }
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) objTuitionPaymentFragmentbindingInflater1;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iTuitionPaymentFragmentbindingInflater1;
        tuitionPaymentFragmentbindingInflater1.b = config;
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = TuitionPaymentFragmentbindingInflater1;
        } else {
            int i3 = AnonymousClass5.TuitionPaymentFragmentspecialinlinedviewModeldefault3[config.ordinal()];
            if (i3 == 1) {
                configArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else if (i3 == 2) {
                configArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            } else if (i3 == 3) {
                configArr = b;
            } else if (i3 == 4) {
                configArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } else {
                configArr = new Bitmap.Config[]{config};
            }
        }
        for (Bitmap.Config config2 : configArr) {
            Integer numCeilingKey = TuitionPaymentFragmentspecialinlinedviewModeldefault2(config2).ceilingKey(Integer.valueOf(iTuitionPaymentFragmentbindingInflater1));
            if (numCeilingKey != null && numCeilingKey.intValue() <= iTuitionPaymentFragmentbindingInflater1 * 8) {
                if (numCeilingKey.intValue() == iTuitionPaymentFragmentbindingInflater1 && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.d;
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size() < 20) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.offer(tuitionPaymentFragmentbindingInflater1);
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.d;
                int iIntValue = numCeilingKey.intValue();
                Object objTuitionPaymentFragmentbindingInflater2 = (updateQuirkSettings) tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.poll();
                if (objTuitionPaymentFragmentbindingInflater2 == null) {
                    objTuitionPaymentFragmentbindingInflater2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
                }
                tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) objTuitionPaymentFragmentbindingInflater2;
                tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iIntValue;
                tuitionPaymentFragmentbindingInflater1.b = config2;
                break;
            }
        }
        Bitmap bitmapTuitionPaymentFragmentbindingInflater1 = this.asInterface.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1);
        if (bitmapTuitionPaymentFragmentbindingInflater1 != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(Integer.valueOf(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1), bitmapTuitionPaymentFragmentbindingInflater1);
            bitmapTuitionPaymentFragmentbindingInflater1.reconfigure(i, i2, config);
        }
        return bitmapTuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.updateOrResetMinLogLevel
    public final Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
        Bitmap bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(Integer.valueOf(getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1)), bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapTuitionPaymentFragmentspecialinlinedviewModeldefault2.get(num);
        if (num2 == null) {
            StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
            sb.append(num);
            sb.append(", removed: ");
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bitmap);
            Bitmap.Config config = bitmap.getConfig();
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            sb2.append("](");
            sb2.append(config);
            sb2.append(")");
            sb.append(sb2.toString());
            sb.append(", this: ");
            sb.append(this);
            throw new NullPointerException(sb.toString());
        }
        if (num2.intValue() == 1) {
            navigableMapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove(num);
        } else {
            navigableMapTuitionPaymentFragmentspecialinlinedviewModeldefault2.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    private NavigableMap<Integer, Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.asBinder.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.asBinder.put(config, treeMap);
        return treeMap;
    }

    @Override // defpackage.updateOrResetMinLogLevel
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(Bitmap bitmap) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        StringBuilder sb = new StringBuilder("[");
        sb.append(iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("](");
        sb.append(config);
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.updateOrResetMinLogLevel
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, Bitmap.Config config) {
        int iTuitionPaymentFragmentbindingInflater1 = getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(i, i2, config);
        StringBuilder sb = new StringBuilder("[");
        sb.append(iTuitionPaymentFragmentbindingInflater1);
        sb.append("](");
        sb.append(config);
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.updateOrResetMinLogLevel
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(Bitmap bitmap) {
        return getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bitmap);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SizeConfigStrategy{groupedMap=");
        sb.append(this.asInterface);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.asBinder.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.asBinder.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends CameraUnavailableExceptionReason<TuitionPaymentFragmentbindingInflater1> {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // defpackage.CameraUnavailableExceptionReason
        protected final /* synthetic */ updateQuirkSettings TuitionPaymentFragmentbindingInflater1() {
            return new TuitionPaymentFragmentbindingInflater1(this);
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1 implements updateQuirkSettings {
        private final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentbindingInflater1;
        int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Bitmap.Config b;

        public TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to getCameraFactory$TuitionPaymentFragmentbindingInflater1 for r3v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.updateQuirkSettings
        public final void TuitionPaymentFragmentbindingInflater1() {
            /*
                r3 = this;
                getCameraFactory$TuitionPaymentFragmentspecialinlinedviewModeldefault1 r0 = r3.TuitionPaymentFragmentbindingInflater1
                java.util.Queue<T extends updateQuirkSettings> r1 = r0.TuitionPaymentFragmentspecialinlinedviewModeldefault3
                int r1 = r1.size()
                r2 = 20
                if (r1 >= r2) goto L11
                java.util.Queue<T extends updateQuirkSettings> r0 = r0.TuitionPaymentFragmentspecialinlinedviewModeldefault3
                r0.offer(r3)
            L11:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: getCameraFactory.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1():void");
        }

        public final String toString() {
            return getCameraFactory.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.b);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof TuitionPaymentFragmentbindingInflater1)) {
                return false;
            }
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) obj;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.b, tuitionPaymentFragmentbindingInflater1.b);
        }

        public final int hashCode() {
            int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Bitmap.Config config = this.b;
            return (i * 31) + (config != null ? config.hashCode() : 0);
        }
    }

    static String TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, Bitmap.Config config) {
        StringBuilder sb = new StringBuilder("[");
        sb.append(i);
        sb.append("](");
        sb.append(config);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: getCameraFactory$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }
}
