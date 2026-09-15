package defpackage;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.ImageAnalysisBlockingAnalyzer;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00038\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019"}, d2 = {"LupdateConfigAndOutput;", "LSafeCloseImageReaderProxyExternalSyntheticLambda0;", "LRetryPolicy1;", "LPreviewExternalSyntheticLambda1;", "p0", "<init>", "(LPreviewExternalSyntheticLambda1;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LPreviewExternalSyntheticLambda1;", "", "hashCode", "()I", "Landroid/app/Activity;", "Landroid/os/Bundle;", "p1", "", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "", "toString", "()Ljava/lang/String;", "LPreviewExternalSyntheticLambda1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class updateConfigAndOutput extends SafeCloseImageReaderProxyExternalSyntheticLambda0 implements RetryPolicy1 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final PreviewExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public updateConfigAndOutput(PreviewExternalSyntheticLambda1 previewExternalSyntheticLambda1) {
        Intrinsics.checkNotNullParameter(previewExternalSyntheticLambda1, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = previewExternalSyntheticLambda1;
    }

    @Override // defpackage.RetryPolicy1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from getter */
    public final PreviewExternalSyntheticLambda1 getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(final Activity p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1<ImageAnalysisBlockingAnalyzer, Unit>() { // from class: com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyApi29$onActivityPreCreated$1
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {67, -127, -109, 9};
            private static final int $$b = 163;
            private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1091688643411214378L;

            /* JADX WARN: Code duplicated, block: B:10:0x002c  */
            /* JADX WARN: Code duplicated, block: B:8:0x0024  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(byte r7, int r8, byte r9, java.lang.Object[] r10) {
                /*
                    int r8 = r8 * 3
                    int r8 = 3 - r8
                    int r9 = r9 * 2
                    int r9 = 98 - r9
                    byte[] r0 = com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyApi29$onActivityPreCreated$1.$$a
                    int r7 = r7 * 4
                    int r7 = 1 - r7
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r7
                    r9 = r8
                    r4 = r2
                    goto L2e
                L17:
                    r3 = r2
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L1b:
                    int r4 = r3 + 1
                    int r9 = r9 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r7) goto L2c
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L2c:
                    r3 = r0[r9]
                L2e:
                    int r3 = -r3
                    int r8 = r8 + r3
                    r3 = r4
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyApi29$onActivityPreCreated$1.c(byte, int, byte, java.lang.Object[]):void");
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer) {
                int i = 2 % 2;
                int i2 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
                $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(imageAnalysisBlockingAnalyzer);
                if (i3 == 0) {
                    Unit unit = Unit.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Unit unit2 = Unit.INSTANCE;
                int i4 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
                return unit2;
            }

            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer) {
                int i = 2 % 2;
                int i2 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
                $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
                    this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(p0.getWindow(), p0, imageAnalysisBlockingAnalyzer);
                } else {
                    Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
                    this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(p0.getWindow(), p0, imageAnalysisBlockingAnalyzer);
                    int i3 = 49 / 0;
                }
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i3 = $10 + 77;
                    $11 = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (((Process.getThreadPriority(0) + 20) >> 6) + 19472), 2624 - TextUtils.getTrimmedLength(""), 13 - ExpandableListView.getPackedPositionGroup(0L), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 9053247990562531611L);
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", "") + 39422), Color.rgb(0, 0, 0) + 16777697, (ViewConfiguration.getFadingEdgeLength() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        int i6 = $10 + 43;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i8 = $11 + 95;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 39422), 481 - (ViewConfiguration.getPressedStateDuration() >> 16), ImageFormat.getBitsPerPixel(0) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(int r26, int r27) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyApi29$onActivityPreCreated$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(int, int):java.lang.Object[]");
            }
        });
        super.onActivityPreCreated(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), p0 != null ? p0.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(p0, "");
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((updateConfigAndOutput) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
    }

    public final String toString() {
        PreviewExternalSyntheticLambda1 previewExternalSyntheticLambda1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StringBuilder sb = new StringBuilder("UserActionTrackingStrategyApi29(");
        sb.append(previewExternalSyntheticLambda1);
        sb.append(")");
        return sb.toString();
    }
}
