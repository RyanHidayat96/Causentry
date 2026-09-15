package defpackage;

import com.koushikdutta.async.AsyncServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;

/* JADX INFO: loaded from: classes4.dex */
public final class isSmallerByArea implements getAbsolutePathFromUri {
    public lambdaonOutputSurface3androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentbindingInflater1;
    public failAllPendingSnapshots TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public AsyncServer TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public SelectionKey TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1230a;
    private lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor asBinder;
    private lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor asInterface;
    public lambdaupdateTransformation3androidxcameracoreprocessingSurfaceEdge b;
    public InetSocketAddress d;
    private lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor g;
    private Exception notify;
    private boolean onTransact;
    private AutoValue_Packet INotificationSideChannel = new AutoValue_Packet();
    private boolean cancel = false;

    @Override // defpackage.executeSafely
    public final void b() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b();
    }

    @Override // defpackage.executeSafely
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final AutoValue_Packet autoValue_Packet) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 != Thread.currentThread()) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(new Runnable() { // from class: isSmallerByArea.5
                @Override // java.lang.Runnable
                public final void run() {
                    isSmallerByArea.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_Packet);
                }
            });
            return;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            try {
                int i = autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                ByteBuffer[] byteBufferArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(byteBufferArrTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                for (ByteBuffer byteBuffer : byteBufferArrTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBuffer);
                }
                int i2 = autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isValid()) {
                    throw new IOException(new CancelledKeyException());
                }
                if (i2 > 0) {
                    SelectionKey selectionKey = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    selectionKey.interestOps(selectionKey.interestOps() | 4);
                } else {
                    SelectionKey selectionKey2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    selectionKey2.interestOps(selectionKey2.interestOps() & (-5));
                }
                int i3 = autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } catch (IOException e2) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel();
                try {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.close();
                } catch (IOException unused) {
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(e2);
            }
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Exception exc) {
        if (this.f1230a) {
            return;
        }
        this.f1230a = true;
        lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor = this.asInterface;
        if (lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor != null) {
            lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor.b(exc);
            this.asInterface = null;
        }
    }

    @Override // defpackage.executeSafely
    public final void TuitionPaymentFragmentbindingInflater1(lambdaonOutputSurface3androidxcameracoreprocessingDefaultSurfaceProcessor lambdaonoutputsurface3androidxcameracoreprocessingdefaultsurfaceprocessor) {
        this.TuitionPaymentFragmentbindingInflater1 = lambdaonoutputsurface3androidxcameracoreprocessingdefaultsurfaceprocessor;
    }

    @Override // defpackage.checkReadyToRelease
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessor) {
        this.asBinder = lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessor;
    }

    @Override // defpackage.checkReadyToRelease
    public final lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor i_() {
        return this.asBinder;
    }

    @Override // defpackage.executeSafely
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor) {
        this.asInterface = lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Exception exc) {
        if (this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 0) {
            this.notify = exc;
            return;
        }
        if (this.onTransact) {
            return;
        }
        this.onTransact = true;
        lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor = this.g;
        if (lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor != null) {
            lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor.b(exc);
        }
    }

    @Override // defpackage.checkReadyToRelease
    public final void b(lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor) {
        this.g = lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor;
    }

    @Override // defpackage.executeSafely
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isValid();
    }

    @Override // defpackage.checkReadyToRelease
    public final void g_() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 != Thread.currentThread()) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(new Runnable() { // from class: isSmallerByArea.2
                @Override // java.lang.Runnable
                public final void run() {
                    isSmallerByArea.this.g_();
                }
            });
        } else {
            if (this.cancel) {
                return;
            }
            this.cancel = true;
            try {
                SelectionKey selectionKey = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                selectionKey.interestOps(selectionKey.interestOps() & (-2));
            } catch (Exception unused) {
            }
        }
    }

    @Override // defpackage.checkReadyToRelease
    public final void h_() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 != Thread.currentThread()) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(new Runnable() { // from class: isSmallerByArea.4
                @Override // java.lang.Runnable
                public final void run() {
                    isSmallerByArea.this.h_();
                }
            });
            return;
        }
        if (this.cancel) {
            this.cancel = false;
            try {
                SelectionKey selectionKey = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                selectionKey.interestOps(selectionKey.interestOps() | 1);
            } catch (Exception unused) {
            }
            if (this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 0) {
                lambdainitGlRenderer10androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, this.INotificationSideChannel);
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isValid()) {
                return;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.notify);
        }
    }

    @Override // defpackage.checkReadyToRelease
    public final boolean f_() {
        return this.cancel;
    }

    @Override // defpackage.getAbsolutePathFromUri, defpackage.checkReadyToRelease
    public final AsyncServer TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.checkReadyToRelease
    public final void TuitionPaymentFragmentbindingInflater1() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel();
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.close();
        } catch (IOException unused) {
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3((Exception) null);
    }

    public final int d() {
        long j;
        int i;
        if (this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 0) {
            lambdainitGlRenderer10androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, this.INotificationSideChannel);
        }
        boolean z = false;
        if (this.cancel) {
            return 0;
        }
        lambdaupdateTransformation3androidxcameracoreprocessingSurfaceEdge lambdaupdatetransformation3androidxcameracoreprocessingsurfaceedge = this.b;
        ByteBuffer byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Math.min(Math.max(lambdaupdatetransformation3androidxcameracoreprocessingsurfaceedge.TuitionPaymentFragmentbindingInflater1, lambdaupdatetransformation3androidxcameracoreprocessingsurfaceedge.TuitionPaymentFragmentspecialinlinedviewModeldefault3), lambdaupdatetransformation3androidxcameracoreprocessingsurfaceedge.b));
        try {
            j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        } catch (Exception e2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel();
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.close();
            } catch (IOException unused) {
            }
            if (this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 0) {
                this.notify = e2;
            } else if (!this.onTransact) {
                this.onTransact = true;
                lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor = this.g;
                if (lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor != null) {
                    lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor.b(e2);
                }
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(e2);
            j = -1;
        }
        if (j < 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel();
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.close();
            } catch (IOException unused2) {
            }
            i = 0;
            z = true;
        } else {
            i = (int) j;
        }
        if (j <= 0) {
            AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        } else {
            this.b.TuitionPaymentFragmentbindingInflater1 = ((int) j) * 2;
            byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.flip();
            this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            lambdainitGlRenderer10androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, this.INotificationSideChannel);
        }
        if (z) {
            if (this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 0) {
                this.notify = null;
            } else if (!this.onTransact) {
                this.onTransact = true;
                lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor2 = this.g;
                if (lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor2 != null) {
                    lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor2.b(null);
                }
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3((Exception) null);
        }
        return i;
    }
}
