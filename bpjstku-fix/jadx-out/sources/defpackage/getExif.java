package defpackage;

import com.koushikdutta.async.AsyncServer;

/* JADX INFO: loaded from: classes4.dex */
public class getExif implements executeSafely {
    private boolean TuitionPaymentFragmentbindingInflater1;
    lambdaonOutputSurface3androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private executeSafely f935a;
    final AutoValue_Packet TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AutoValue_Packet();
    public int b = Integer.MAX_VALUE;

    protected void b(AutoValue_Packet autoValue_Packet) {
    }

    public getExif(executeSafely executesafely) {
        this.f935a = executesafely;
        executesafely.TuitionPaymentFragmentbindingInflater1(new getCompleter(this));
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        boolean z;
        lambdaonOutputSurface3androidxcameracoreprocessingDefaultSurfaceProcessor lambdaonoutputsurface3androidxcameracoreprocessingdefaultsurfaceprocessor;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return;
        }
        synchronized (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            this.f935a.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0;
        }
        if (z && this.TuitionPaymentFragmentbindingInflater1) {
            this.f935a.b();
        }
        if (!z || (lambdaonoutputsurface3androidxcameracoreprocessingdefaultsurfaceprocessor = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
            return;
        }
        lambdaonoutputsurface3androidxcameracoreprocessingdefaultsurfaceprocessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    @Override // defpackage.executeSafely
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AutoValue_Packet autoValue_Packet) {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1 != Thread.currentThread()) {
            synchronized (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >= this.b) {
                    return;
                }
                b(autoValue_Packet);
                autoValue_Packet.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(new Runnable() { // from class: getOutConfigs
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    }
                }, 0L);
                return;
            }
        }
        b(autoValue_Packet);
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 0 && !this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.f935a.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_Packet);
        }
        synchronized (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            autoValue_Packet.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }

    @Override // defpackage.executeSafely
    public final void TuitionPaymentFragmentbindingInflater1(lambdaonOutputSurface3androidxcameracoreprocessingDefaultSurfaceProcessor lambdaonoutputsurface3androidxcameracoreprocessingdefaultsurfaceprocessor) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdaonoutputsurface3androidxcameracoreprocessingdefaultsurfaceprocessor;
    }

    @Override // defpackage.executeSafely
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.f935a.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // defpackage.executeSafely
    public void b() {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1 == Thread.currentThread()) {
            synchronized (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 0) {
                    this.TuitionPaymentFragmentbindingInflater1 = true;
                    return;
                } else {
                    this.f935a.b();
                    return;
                }
            }
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(new Runnable() { // from class: AutoValue_SurfaceProcessorNode_In
            @Override // java.lang.Runnable
            public final void run() {
                this.b.b();
            }
        }, 0L);
    }

    @Override // defpackage.executeSafely
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor) {
        this.f935a.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor);
    }

    @Override // defpackage.executeSafely
    public final AsyncServer TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.f935a.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }
}
