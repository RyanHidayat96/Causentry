package defpackage;

import com.koushikdutta.async.AsyncServer;

/* JADX INFO: loaded from: classes4.dex */
public class lambdaexecuteSafely11 extends getSurfaceEdge implements lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor, setConsumer, DefaultSurfaceProcessor {
    private int TuitionPaymentFragmentbindingInflater1;
    private DefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private checkReadyToRelease TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private boolean b;

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkReadyToRelease checkreadytorelease) {
        checkReadyToRelease checkreadytorelease2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (checkreadytorelease2 != null) {
            checkreadytorelease2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(null);
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = checkreadytorelease;
        checkreadytorelease.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(new lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor() { // from class: lambdaexecuteSafely11.2
            @Override // defpackage.lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor
            public final void b(Exception exc) {
                lambdaexecuteSafely11.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(exc);
            }
        });
    }

    @Override // defpackage.DefaultSurfaceProcessor
    public final void TuitionPaymentFragmentbindingInflater1(DefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public void TuitionPaymentFragmentbindingInflater1(checkReadyToRelease checkreadytorelease, AutoValue_Packet autoValue_Packet) {
        if (!this.b) {
            if (autoValue_Packet != null) {
                this.TuitionPaymentFragmentbindingInflater1 += autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            lambdainitGlRenderer10androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, autoValue_Packet);
            if (autoValue_Packet != null) {
                this.TuitionPaymentFragmentbindingInflater1 -= autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            DefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault2 == null || autoValue_Packet == null) {
                return;
            }
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
            return;
        }
        while (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
            AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove());
        }
        autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    }

    @Override // defpackage.checkReadyToRelease
    public final void g_() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.g_();
    }

    @Override // defpackage.checkReadyToRelease
    public void h_() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.h_();
    }

    @Override // defpackage.checkReadyToRelease
    public boolean f_() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f_();
    }

    @Override // defpackage.checkReadyToRelease
    public AsyncServer TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    @Override // defpackage.checkReadyToRelease
    public void TuitionPaymentFragmentbindingInflater1() {
        this.b = true;
        checkReadyToRelease checkreadytorelease = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (checkreadytorelease != null) {
            checkreadytorelease.TuitionPaymentFragmentbindingInflater1();
        }
    }
}
