package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class increaseMinLogLevelReference implements CameraUnavailableException {
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final initInternal<b, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f1201a;
    private final Map<Class<?>, getConfigProvider<?>> b;

    public increaseMinLogLevelReference() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new initInternal<>();
        this.TuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        this.f1201a = new HashMap();
        this.b = new HashMap();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 4194304;
    }

    public increaseMinLogLevelReference(int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new initInternal<>();
        this.TuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        this.f1201a = new HashMap();
        this.b = new HashMap();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
    }

    @Override // defpackage.CameraUnavailableException
    public final <T> void TuitionPaymentFragmentspecialinlinedviewModeldefault1(T t) {
        synchronized (this) {
            Class<?> cls = t.getClass();
            getConfigProvider<T> getconfigproviderB = b(cls);
            int iB = getconfigproviderB.b(t);
            int iB2 = getconfigproviderB.b() * iB;
            if (iB2 <= this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 2) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentbindingInflater1;
                Object objTuitionPaymentFragmentbindingInflater1 = (updateQuirkSettings) tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.poll();
                if (objTuitionPaymentFragmentbindingInflater1 == null) {
                    objTuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
                }
                b bVar = (b) objTuitionPaymentFragmentbindingInflater1;
                bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iB;
                bVar.b = cls;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bVar, t);
                NavigableMap<Integer, Integer> navigableMapTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(cls);
                Integer num = (Integer) navigableMapTuitionPaymentFragmentspecialinlinedviewModeldefault1.get(Integer.valueOf(bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
                navigableMapTuitionPaymentFragmentspecialinlinedviewModeldefault1.put(Integer.valueOf(bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 += iB2;
                b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.CameraUnavailableException
    public final <T> T TuitionPaymentFragmentbindingInflater1(Class<T> cls) {
        T t;
        synchronized (this) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentbindingInflater1;
            Object objTuitionPaymentFragmentbindingInflater1 = (updateQuirkSettings) tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.poll();
            if (objTuitionPaymentFragmentbindingInflater1 == null) {
                objTuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
            }
            b bVar = (b) objTuitionPaymentFragmentbindingInflater1;
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 8;
            bVar.b = cls;
            t = (T) TuitionPaymentFragmentspecialinlinedviewModeldefault2(bVar, cls);
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.CameraUnavailableException
    public final <T> T TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, Class<T> cls) {
        b bVar;
        T t;
        int i2;
        synchronized (this) {
            Integer numCeilingKey = TuitionPaymentFragmentspecialinlinedviewModeldefault1((Class<?>) cls).ceilingKey(Integer.valueOf(i));
            if (numCeilingKey != null && ((i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == 0 || this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / i2 >= 2 || numCeilingKey.intValue() <= i * 8)) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentbindingInflater1;
                int iIntValue = numCeilingKey.intValue();
                Object objTuitionPaymentFragmentbindingInflater1 = (updateQuirkSettings) tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.poll();
                if (objTuitionPaymentFragmentbindingInflater1 == null) {
                    objTuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
                }
                bVar = (b) objTuitionPaymentFragmentbindingInflater1;
                bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                bVar.b = cls;
            } else {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentbindingInflater1;
                Object objTuitionPaymentFragmentbindingInflater2 = (updateQuirkSettings) tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.poll();
                if (objTuitionPaymentFragmentbindingInflater2 == null) {
                    objTuitionPaymentFragmentbindingInflater2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
                }
                bVar = (b) objTuitionPaymentFragmentbindingInflater2;
                bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
                bVar.b = cls;
            }
            t = (T) TuitionPaymentFragmentspecialinlinedviewModeldefault2(bVar, cls);
        }
        return t;
    }

    private <T> T TuitionPaymentFragmentspecialinlinedviewModeldefault2(b bVar, Class<T> cls) {
        getConfigProvider<T> getconfigproviderB = b(cls);
        T t = (T) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(bVar);
        if (t != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 -= getconfigproviderB.b(t) * getconfigproviderB.b();
            b(getconfigproviderB.b(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(getconfigproviderB.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 2)) {
            getconfigproviderB.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        return getconfigproviderB.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // defpackage.CameraUnavailableException
    public final void b() {
        synchronized (this) {
            b(0);
        }
    }

    @Override // defpackage.CameraUnavailableException
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        synchronized (this) {
            try {
                if (i >= 40) {
                    synchronized (this) {
                        b(0);
                    }
                } else if (i >= 20 || i == 15) {
                    b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(int i) throws Throwable {
        while (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > i) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                throw new NullPointerException("Argument must not be null");
            }
            getConfigProvider getconfigproviderB = b(objTuitionPaymentFragmentspecialinlinedviewModeldefault1.getClass());
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 -= getconfigproviderB.b(objTuitionPaymentFragmentspecialinlinedviewModeldefault1) * getconfigproviderB.b();
            b(getconfigproviderB.b(objTuitionPaymentFragmentspecialinlinedviewModeldefault1), objTuitionPaymentFragmentspecialinlinedviewModeldefault1.getClass());
            if (Log.isLoggable(getconfigproviderB.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 2)) {
                getconfigproviderB.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                getconfigproviderB.b(objTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        }
    }

    private void b(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(cls);
        Integer num = (Integer) navigableMapTuitionPaymentFragmentspecialinlinedviewModeldefault1.get(Integer.valueOf(i));
        if (num == null) {
            StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
            sb.append(i);
            sb.append(", this: ");
            sb.append(this);
            throw new NullPointerException(sb.toString());
        }
        if (num.intValue() == 1) {
            navigableMapTuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(Integer.valueOf(i));
        } else {
            navigableMapTuitionPaymentFragmentspecialinlinedviewModeldefault1.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    private NavigableMap<Integer, Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f1201a.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f1201a.put(cls, treeMap);
        return treeMap;
    }

    private <T> getConfigProvider<T> b(Class<T> cls) {
        getConfigProvider<T> shutdowninternal;
        getConfigProvider<T> getconfigprovider = (getConfigProvider) this.b.get(cls);
        if (getconfigprovider != null) {
            return getconfigprovider;
        }
        if (cls.equals(int[].class)) {
            shutdowninternal = new initAndRetryRecursively();
        } else if (cls.equals(byte[].class)) {
            shutdowninternal = new shutdownInternal();
        } else {
            StringBuilder sb = new StringBuilder("No array pool found for: ");
            sb.append(cls.getSimpleName());
            throw new IllegalArgumentException(sb.toString());
        }
        this.b.put(cls, shutdowninternal);
        return shutdowninternal;
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends CameraUnavailableExceptionReason<b> {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // defpackage.CameraUnavailableExceptionReason
        protected final /* synthetic */ updateQuirkSettings TuitionPaymentFragmentbindingInflater1() {
            return new b(this);
        }
    }

    static final class b implements updateQuirkSettings {
        private final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Class<?> b;

        b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.b == bVar.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key{size=");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            sb.append("array=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to increaseMinLogLevelReference$b for r3v1 'this'  java.lang.Object
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
                increaseMinLogLevelReference$TuitionPaymentFragmentspecialinlinedviewModeldefault2 r0 = r3.TuitionPaymentFragmentspecialinlinedviewModeldefault2
                java.util.Queue<T extends updateQuirkSettings> r1 = r0.TuitionPaymentFragmentspecialinlinedviewModeldefault3
                int r1 = r1.size()
                r2 = 20
                if (r1 >= r2) goto L11
                java.util.Queue<T extends updateQuirkSettings> r0 = r0.TuitionPaymentFragmentspecialinlinedviewModeldefault3
                r0.offer(r3)
            L11:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: increaseMinLogLevelReference.b.TuitionPaymentFragmentbindingInflater1():void");
        }

        public final int hashCode() {
            int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Class<?> cls = this.b;
            return (i * 31) + (cls != null ? cls.hashCode() : 0);
        }
    }
}
