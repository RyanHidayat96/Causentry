package defpackage;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.libraries.places.internal.zzpr;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.internal.WriteMode;

/* JADX INFO: loaded from: classes7.dex */
public final class fromId extends restartCameraIfAnalyzerResolutionChanged implements transformView {
    private final WriteMode TuitionPaymentFragmentbindingInflater1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final PreviewStreamStateObserver2 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final getRemainingRotationDegrees TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PreviewViewImplementationOnSurfaceNotInUseListener f904a;
    private String asBinder;
    private final transformView[] asInterface;
    private final lambdanew1androidxcameraviewPreviewView b;
    private String g;
    private static final byte[] $$c = {53, -70, 9, -72};
    private static final int $$d = 211;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {27, 65, -33, 120, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = ModuleDescriptor.MODULE_VERSION;
    private static int notify = 0;
    private static int cancel = 1;
    private static char[] d = {47329, 47380, 47390, 47376, 47379, 47385, 47316, 47375, 47343, 47369, 47374, 47389, 47381, 47359, 47382, 47391, 47383, 47378, 47344};
    private static int onTransact = 2047719554;
    private static boolean INotificationSideChannel = true;
    private static boolean cancelAll = true;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | (~(i8 | i5));
        int i10 = ~i5;
        int i11 = i9 | (~(i10 | i6 | i2));
        int i12 = i6 | i2;
        int i13 = i10 | i12;
        int i14 = (~(i5 | i6)) | (~i12);
        int i15 = i6 + i2 + i4 + (1068639271 * i3) + ((-1919980423) * i);
        int i16 = i15 * i15;
        int i17 = ((i6 * 1648758371) - 594280448) + (1648758371 * i2) + (i11 * (-226102882)) + ((-226102882) * i13) + (226102882 * i14) + (1422655488 * i4) + ((-1693188096) * i3) + (611057664 * i) + ((-810221568) * i16);
        int i18 = (i6 * 982247175) + 1844138806 + (i2 * 982247175) + (i11 * (-762)) + (i13 * (-762)) + (i14 * 762) + (i4 * 982246413) + (i3 * 1533776379) + (i * 1016546853) + (i16 * (-1070530560));
        int i19 = i17 + (i18 * i18 * 1708326912);
        if (i19 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i19 != 2) {
            return i19 != 3 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : b(objArr);
        }
        fromId fromid = (fromId) objArr[0];
        createImageAnalysis createimageanalysis = (createImageAnalysis) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i20 = 2 % 2;
        int i21 = cancel + 19;
        notify = i21 % 128;
        int i22 = i21 % 2;
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        fromid.encodeString(createimageanalysis.TuitionPaymentFragmentbindingInflater1(iIntValue));
        int i23 = cancel + 81;
        notify = i23 % 128;
        int i24 = i23 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 52
            int r8 = 56 - r8
            byte[] r0 = defpackage.fromId.$$a
            int r1 = 53 - r7
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2f
        L16:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L2f:
            int r6 = -r6
            int r8 = r8 + r6
            int r8 = r8 + (-11)
            int r6 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fromId.c(short, short, short, java.lang.Object[]):void");
    }

    @Override // defpackage.transformView
    public final PreviewStreamStateObserver2 TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 55;
        cancel = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        PreviewStreamStateObserver2 previewStreamStateObserver2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = i2 + 23;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        return previewStreamStateObserver2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    private fromId(lambdanew1androidxcameraviewPreviewView lambdanew1androidxcameraviewpreviewview, PreviewStreamStateObserver2 previewStreamStateObserver2, WriteMode writeMode, transformView[] transformviewArr) {
        Intrinsics.checkNotNullParameter(lambdanew1androidxcameraviewpreviewview, "");
        Intrinsics.checkNotNullParameter(previewStreamStateObserver2, "");
        Intrinsics.checkNotNullParameter(writeMode, "");
        this.b = lambdanew1androidxcameraviewpreviewview;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = previewStreamStateObserver2;
        this.TuitionPaymentFragmentbindingInflater1 = writeMode;
        this.asInterface = transformviewArr;
        this.f904a = previewStreamStateObserver2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = previewStreamStateObserver2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iOrdinal = writeMode.ordinal();
        if (transformviewArr != null) {
            transformView transformview = transformviewArr[iOrdinal];
            if (transformview == null) {
                int i = notify + 85;
                cancel = i % 128;
                int i2 = i % 2;
                if (transformview != this) {
                    transformviewArr[iOrdinal] = this;
                    int i3 = 2 % 2;
                }
            } else {
                transformviewArr[iOrdinal] = this;
                int i4 = 2 % 2;
            }
        }
        int i5 = notify + 37;
        cancel = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public fromId(updateDisplayRotationIfNeeded updatedisplayrotationifneeded, PreviewStreamStateObserver2 previewStreamStateObserver2, WriteMode writeMode, transformView[] transformviewArr) {
        redrawPreview lambdanew1androidxcameraviewpreviewview;
        int i;
        Intrinsics.checkNotNullParameter(updatedisplayrotationifneeded, "");
        Intrinsics.checkNotNullParameter(previewStreamStateObserver2, "");
        Intrinsics.checkNotNullParameter(writeMode, "");
        Intrinsics.checkNotNullParameter(transformviewArr, "");
        Intrinsics.checkNotNullParameter(updatedisplayrotationifneeded, "");
        Intrinsics.checkNotNullParameter(previewStreamStateObserver2, "");
        if (previewStreamStateObserver2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b) {
            lambdanew1androidxcameraviewpreviewview = new redrawPreview(updatedisplayrotationifneeded, previewStreamStateObserver2);
            i = notify + 15;
            cancel = i % 128;
        } else {
            lambdanew1androidxcameraviewpreviewview = new lambdanew1androidxcameraviewPreviewView(updatedisplayrotationifneeded);
            i = cancel + 29;
            notify = i % 128;
        }
        int i2 = i % 2;
        int i3 = 2 % 2;
        this(lambdanew1androidxcameraviewpreviewview, previewStreamStateObserver2, writeMode, transformviewArr);
    }

    @Override // defpackage.startListeningToRotationEvents
    public final PreviewViewImplementationOnSurfaceNotInUseListener getSerializersModule() {
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 7;
        cancel = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        PreviewViewImplementationOnSurfaceNotInUseListener previewViewImplementationOnSurfaceNotInUseListener = this.f904a;
        int i4 = i2 + 81;
        cancel = i4 % 128;
        if (i4 % 2 != 0) {
            return previewViewImplementationOnSurfaceNotInUseListener;
        }
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.isUseCaseEnabled
    public final boolean shouldEncodeElementDefault(createImageAnalysis createimageanalysis, int i) {
        int i2 = 2 % 2;
        int i3 = cancel + 53;
        notify = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(createimageanalysis, "");
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        int i4 = 75 / 0;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final isUseCaseEnabled beginStructure(createImageAnalysis createimageanalysis) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        WriteMode writeModeTuitionPaymentFragmentbindingInflater1 = getPreview.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, createimageanalysis);
        if (writeModeTuitionPaymentFragmentbindingInflater1.begin != 0) {
            lambdanew1androidxcameraviewPreviewView lambdanew1androidxcameraviewpreviewview = this.b;
            lambdanew1androidxcameraviewpreviewview.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(writeModeTuitionPaymentFragmentbindingInflater1.begin);
            this.b.b();
        }
        String str = this.asBinder;
        if (str != null) {
            String iNotificationSideChannel = this.g;
            if (iNotificationSideChannel == null) {
                iNotificationSideChannel = createimageanalysis.getINotificationSideChannel();
                int i2 = cancel + 21;
                notify = i2 % 128;
                int i3 = i2 % 2;
            }
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            encodeString(str);
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(':');
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            encodeString(iNotificationSideChannel);
            this.asBinder = null;
            this.g = null;
        }
        if (this.TuitionPaymentFragmentbindingInflater1 == writeModeTuitionPaymentFragmentbindingInflater1) {
            int i4 = cancel + 41;
            notify = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            int i5 = 40 / 0;
            return this;
        }
        transformView[] transformviewArr = this.asInterface;
        if (transformviewArr != null) {
            int i6 = notify + 27;
            cancel = i6 % 128;
            int i7 = i6 % 2;
            int iOrdinal = writeModeTuitionPaymentFragmentbindingInflater1.ordinal();
            if (i7 == 0) {
                transformView transformview = transformviewArr[iOrdinal];
                throw null;
            }
            transformView transformview2 = transformviewArr[iOrdinal];
            if (transformview2 != null) {
                return transformview2;
            }
        }
        return new fromId(this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, writeModeTuitionPaymentFragmentbindingInflater1, this.asInterface);
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.isUseCaseEnabled
    public final void endStructure(createImageAnalysis createimageanalysis) {
        int i = 2 % 2;
        int i2 = cancel + 119;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        if (this.TuitionPaymentFragmentbindingInflater1.end != 0) {
            int i4 = notify + 81;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            this.b.TuitionPaymentFragmentbindingInflater1();
            lambdanew1androidxcameraviewPreviewView lambdanew1androidxcameraviewpreviewview = this.b;
            lambdanew1androidxcameraviewpreviewview.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(this.TuitionPaymentFragmentbindingInflater1.end);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:16:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:19:0x006b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged
    public final boolean encodeElement(createImageAnalysis createimageanalysis, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        int i4 = fromId$TuitionPaymentFragmentspecialinlinedviewModeldefault1$WhenMappings.$EnumSwitchMapping$0[this.TuitionPaymentFragmentbindingInflater1.ordinal()];
        if (i4 != 1) {
            int i5 = cancel + 47;
            int i6 = i5 % 128;
            notify = i6;
            boolean z = false;
            if (i5 % 2 != 0) {
                if (i4 != 2) {
                    int i7 = i6 + 87;
                    i2 = i7 % 128;
                    cancel = i2;
                    int i8 = i7 % 2;
                    if (i4 != 3) {
                        if (!this.b.TuitionPaymentFragmentbindingInflater1) {
                            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(',');
                        }
                        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        encodeString(PreviewViewExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(createimageanalysis, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, i));
                        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(':');
                        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    } else {
                        if (i == 0) {
                            int i9 = i2 + 17;
                            notify = i9 % 128;
                            int i10 = i9 % 2;
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
                        }
                        if (i == 1) {
                            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(',');
                            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
                        }
                    }
                } else {
                    z = true;
                    if (this.b.TuitionPaymentFragmentbindingInflater1) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
                    } else {
                        if (i % 2 == 0) {
                            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(',');
                            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            z = true;
                        } else {
                            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(':');
                            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        }
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
                    }
                }
            } else if (i4 != 2) {
                int i11 = i6 + 87;
                i2 = i11 % 128;
                cancel = i2;
                int i12 = i11 % 2;
                if (i4 != 3) {
                    if (!this.b.TuitionPaymentFragmentbindingInflater1) {
                        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(',');
                    }
                    this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    encodeString(PreviewViewExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(createimageanalysis, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, i));
                    this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(':');
                    this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                } else {
                    if (i == 0) {
                        int i13 = i2 + 17;
                        notify = i13 % 128;
                        int i14 = i13 % 2;
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
                    }
                    if (i == 1) {
                        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(',');
                        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
                    }
                }
            } else if (this.b.TuitionPaymentFragmentbindingInflater1) {
                if (i % 2 == 0) {
                    this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(',');
                    this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    z = true;
                } else {
                    this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(':');
                    this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            }
            return true;
        }
        if (!this.b.TuitionPaymentFragmentbindingInflater1) {
            int i15 = notify + 107;
            cancel = i15 % 128;
            int i16 = i15 % 2;
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(',');
        }
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i17 = notify + 115;
        cancel = i17 % 128;
        int i18 = i17 % 2;
        return true;
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.isUseCaseEnabled
    public final <T> void encodeNullableSerializableElement(createImageAnalysis createimageanalysis, int i, QualityAddedEncoderProfilesProvider<? super T> qualityAddedEncoderProfilesProvider, T t) {
        int i2 = 2 % 2;
        int i3 = cancel + 61;
        notify = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Intrinsics.checkNotNullParameter(qualityAddedEncoderProfilesProvider, "");
        if (t == null) {
            int i5 = cancel + 19;
            notify = i5 % 128;
            int i6 = i5 % 2;
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.a) {
                return;
            }
        }
        super.encodeNullableSerializableElement(createimageanalysis, i, qualityAddedEncoderProfilesProvider, t);
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final startListeningToRotationEvents encodeInline(createImageAnalysis createimageanalysis) {
        int i = 2 % 2;
        int i2 = cancel + 71;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        if (onFrameUpdate.TuitionPaymentFragmentspecialinlinedviewModeldefault1(createimageanalysis)) {
            setController setcontroller = this.b;
            if (!(setcontroller instanceof setController)) {
                setcontroller = new setController(setcontroller.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            return new fromId(setcontroller, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1, (transformView[]) null);
        }
        if (!onFrameUpdate.b(createimageanalysis)) {
            if (this.asBinder == null) {
                return super.encodeInline(createimageanalysis);
            }
            int i4 = notify + 7;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            this.g = createimageanalysis.getINotificationSideChannel();
            return this;
        }
        int i6 = notify + 13;
        cancel = i6 % 128;
        int i7 = i6 % 2;
        setFrameUpdateListener setframeupdatelistener = this.b;
        if (!(setframeupdatelistener instanceof setFrameUpdateListener)) {
            setframeupdatelistener = new setFrameUpdateListener(setframeupdatelistener.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return new fromId(setframeupdatelistener, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1, (transformView[]) null);
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = d;
        if (cArr2 != null) {
            int i3 = $10 + 59;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) (31339 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int scrollDefaultDelay = 2994 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int modifierMetaStateMask = 16 - ((byte) KeyEvent.getModifierMetaStateMask());
                        byte b = (byte) ($$d & 5);
                        byte b2 = (byte) (b - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, scrollDefaultDelay, modifierMetaStateMask, 1182129903, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onTransact)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            long j = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43326 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> 8) + 253, 22 - View.getDefaultSize(0, 0), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            if (cancelAll) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    try {
                        Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 33601), 3085 - (ViewConfiguration.getFadingEdgeLength() >> 16), Drawable.resolveOpacity(0, 0) + 26, -2146875848, false, $$e(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        int i6 = $10 + 93;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                        j = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!INotificationSideChannel) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33603 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 3086 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 26 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -2146875848, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeNull() {
        int i = 2 % 2;
        int i2 = cancel + 105;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            lambdanew1androidxcameraviewPreviewView lambdanew1androidxcameraviewpreviewview = this.b;
            Intrinsics.checkNotNullParameter("null", "");
            lambdanew1androidxcameraviewpreviewview.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b("null");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        lambdanew1androidxcameraviewPreviewView lambdanew1androidxcameraviewpreviewview2 = this.b;
        Intrinsics.checkNotNullParameter("null", "");
        lambdanew1androidxcameraviewpreviewview2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b("null");
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeBoolean(boolean z) {
        int i = 2 % 2;
        int i2 = cancel;
        int i3 = i2 + 11;
        notify = i3 % 128;
        int i4 = i3 % 2;
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(String.valueOf(z));
            return;
        }
        int i5 = i2 + 121;
        notify = i5 % 128;
        int i6 = i5 % 2;
        encodeString(String.valueOf(z));
        if (i6 != 0) {
            int i7 = 14 / 0;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        fromId fromid = (fromId) objArr[0];
        byte bByteValue = ((Byte) objArr[1]).byteValue();
        int i = 2 % 2;
        int i2 = notify + 55;
        int i3 = i2 % 128;
        cancel = i3;
        int i4 = i2 % 2;
        if (!(true ^ fromid.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            int i5 = i3 + 91;
            notify = i5 % 128;
            int i6 = i5 % 2;
            fromid.encodeString(String.valueOf((int) bByteValue));
            return null;
        }
        fromid.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bByteValue);
        int i7 = cancel + 13;
        notify = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r3.b.b(r4);
        r4 = defpackage.fromId.cancel + 89;
        defpackage.fromId.notify = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if ((!r3.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        encodeString(java.lang.String.valueOf((int) r4));
     */
    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void encodeShort(short r4) throws java.lang.Throwable {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = defpackage.fromId.cancel
            int r1 = r1 + 89
            int r2 = r1 % 128
            defpackage.fromId.notify = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L19
            boolean r1 = r3.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r2 = 16
            int r2 = r2 / 0
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L25
            goto L1d
        L19:
            boolean r1 = r3.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            if (r1 == 0) goto L25
        L1d:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.encodeString(r4)
            return
        L25:
            lambdanew1androidxcameraviewPreviewView r1 = r3.b
            r1.b(r4)
            int r4 = defpackage.fromId.cancel
            int r4 = r4 + 89
            int r1 = r4 % 128
            defpackage.fromId.notify = r1
            int r4 = r4 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fromId.encodeShort(short):void");
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeInt(int i) {
        int i2 = 2 % 2;
        int i3 = cancel;
        int i4 = i3 + 37;
        notify = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
            int i6 = notify + 1;
            cancel = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i7 = i3 + 91;
        notify = i7 % 128;
        int i8 = i7 % 2;
        encodeString(String.valueOf(i));
        if (i8 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeLong(long j) {
        int i = 2 % 2;
        int i2 = notify + 103;
        int i3 = i2 % 128;
        cancel = i3;
        int i4 = i2 % 2;
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            this.b.b(j);
            int i5 = notify + 33;
            cancel = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int i7 = i3 + 109;
        notify = i7 % 128;
        int i8 = i7 % 2;
        encodeString(String.valueOf(j));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (java.lang.Float.isNaN(r7) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (java.lang.Float.isNaN(r7) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object TuitionPaymentFragmentbindingInflater1(java.lang.Object[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            fromId r1 = (defpackage.fromId) r1
            r2 = 1
            r7 = r7[r2]
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            r3 = 2
            int r4 = r3 % r3
            int r4 = defpackage.fromId.notify
            int r4 = r4 + 7
            int r5 = r4 % 128
            defpackage.fromId.cancel = r5
            int r4 = r4 % r3
            r5 = 0
            if (r4 == 0) goto L7a
            boolean r4 = r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            if (r4 == r2) goto L36
            lambdanew1androidxcameraviewPreviewView r4 = r1.b
            updateDisplayRotationIfNeeded r4 = r4.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            java.lang.String r6 = java.lang.String.valueOf(r7)
            r4.b(r6)
            int r4 = defpackage.fromId.cancel
            int r4 = r4 + 67
            int r6 = r4 % 128
            defpackage.fromId.notify = r6
            int r4 = r4 % r3
            goto L3d
        L36:
            java.lang.String r4 = java.lang.String.valueOf(r7)
            r1.encodeString(r4)
        L3d:
            getRemainingRotationDegrees r4 = r1.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            boolean r4 = r4.INotificationSideChannel
            if (r4 != 0) goto L79
            boolean r4 = java.lang.Float.isInfinite(r7)
            r2 = r2 ^ r4
            if (r2 == 0) goto L66
            int r2 = defpackage.fromId.notify
            int r2 = r2 + 123
            int r4 = r2 % 128
            defpackage.fromId.cancel = r4
            int r2 = r2 % r3
            if (r2 != 0) goto L5f
            boolean r2 = java.lang.Float.isNaN(r7)
            r3 = 22
            int r3 = r3 / r0
            if (r2 != 0) goto L66
            goto L65
        L5f:
            boolean r0 = java.lang.Float.isNaN(r7)
            if (r0 != 0) goto L66
        L65:
            return r5
        L66:
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            lambdanew1androidxcameraviewPreviewView r0 = r1.b
            updateDisplayRotationIfNeeded r0 = r0.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            java.lang.String r0 = r0.toString()
            kotlinx.serialization.json.internal.JsonEncodingException r7 = defpackage.setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r7, r0)
            throw r7
        L79:
            return r5
        L7a:
            boolean r7 = r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fromId.TuitionPaymentFragmentbindingInflater1(java.lang.Object[]):java.lang.Object");
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeDouble(double d2) {
        int i = 2 % 2;
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(String.valueOf(d2));
            int i2 = notify + 103;
            cancel = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = notify + 13;
            cancel = i4 % 128;
            if (i4 % 2 == 0) {
                encodeString(String.valueOf(d2));
                int i5 = 20 / 0;
            } else {
                encodeString(String.valueOf(d2));
            }
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel) {
            return;
        }
        int i6 = cancel + 85;
        notify = i6 % 128;
        int i7 = i6 % 2;
        if (Double.isInfinite(d2) || Double.isNaN(d2)) {
            throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Double.valueOf(d2), this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.toString());
        }
        int i8 = notify + 11;
        cancel = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006d  */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        fromId fromid = (fromId) objArr[0];
        QualityAddedEncoderProfilesProvider qualityAddedEncoderProfilesProvider = (QualityAddedEncoderProfilesProvider) objArr[1];
        Object obj = objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(qualityAddedEncoderProfilesProvider, "");
        fromId fromid2 = fromid;
        if (fromid2.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface) {
            qualityAddedEncoderProfilesProvider.serialize(fromid2, obj);
            return null;
        }
        boolean z = qualityAddedEncoderProfilesProvider instanceof setTargetOutputSize;
        if (!z) {
            int i2 = PreviewView1ExternalSyntheticLambda1$b$WhenMappings.$EnumSwitchMapping$0[fromid2.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelDefault.ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                deactivateRecording deactivaterecordingTuitionPaymentFragmentbindingInflater1 = qualityAddedEncoderProfilesProvider.getDescriptor().TuitionPaymentFragmentbindingInflater1();
                if (!(!Intrinsics.areEqual(deactivaterecordingTuitionPaymentFragmentbindingInflater1, isCameraAttached.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE)) || Intrinsics.areEqual(deactivaterecordingTuitionPaymentFragmentbindingInflater1, isCameraAttached.TuitionPaymentFragmentbindingInflater1.INSTANCE)) {
                    strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = PreviewView1ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(qualityAddedEncoderProfilesProvider.getDescriptor(), fromid2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                    int i3 = notify + 41;
                    cancel = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        } else if (fromid2.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelDefault != ClassDiscriminatorMode.NONE) {
            strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = PreviewView1ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(qualityAddedEncoderProfilesProvider.getDescriptor(), fromid2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            int i5 = notify + 41;
            cancel = i5 % 128;
            int i6 = i5 % 2;
        } else {
            strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        }
        if (z) {
            int i7 = notify + 7;
            cancel = i7 % 128;
            int i8 = i7 % 2;
            setTargetOutputSize settargetoutputsize = (setTargetOutputSize) qualityAddedEncoderProfilesProvider;
            if (obj == null) {
                StringBuilder sb = new StringBuilder("Value for serializer ");
                sb.append(settargetoutputsize.getDescriptor());
                sb.append(" should always be non-null. Please report issue to the kotlinx.serialization tracker.");
                throw new IllegalArgumentException(sb.toString().toString());
            }
            QualityAddedEncoderProfilesProvider qualityAddedEncoderProfilesProviderB = deriveVideoProfile.b(settargetoutputsize, fromid2, obj);
            if (strTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null && (qualityAddedEncoderProfilesProvider instanceof OutputUtil)) {
                createImageAnalysis descriptor = qualityAddedEncoderProfilesProviderB.getDescriptor();
                Intrinsics.checkNotNullParameter(descriptor, "");
                if (updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1(descriptor).contains(strTuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                    String iNotificationSideChannel = ((OutputUtil) qualityAddedEncoderProfilesProvider).getDescriptor().getINotificationSideChannel();
                    String iNotificationSideChannel2 = qualityAddedEncoderProfilesProviderB.getDescriptor().getINotificationSideChannel();
                    StringBuilder sb2 = new StringBuilder("Sealed class '");
                    sb2.append(iNotificationSideChannel2);
                    sb2.append("' cannot be serialized as base class '");
                    sb2.append(iNotificationSideChannel);
                    sb2.append("' because it has property name that conflicts with JSON class discriminator '");
                    sb2.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    sb2.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                    throw new IllegalStateException(sb2.toString().toString());
                }
            }
            deactivateRecording deactivaterecordingTuitionPaymentFragmentbindingInflater2 = qualityAddedEncoderProfilesProviderB.getDescriptor().TuitionPaymentFragmentbindingInflater1();
            Intrinsics.checkNotNullParameter(deactivaterecordingTuitionPaymentFragmentbindingInflater2, "");
            if (deactivaterecordingTuitionPaymentFragmentbindingInflater2 instanceof deactivateRecording.TuitionPaymentFragmentbindingInflater1) {
                throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
            }
            if (deactivaterecordingTuitionPaymentFragmentbindingInflater2 instanceof checkAudioPermissionGranted) {
                throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
            }
            if (deactivaterecordingTuitionPaymentFragmentbindingInflater2 instanceof resolveInputTimebase) {
                throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
            }
            Intrinsics.checkNotNull(qualityAddedEncoderProfilesProviderB, "");
            int i9 = notify + 19;
            cancel = i9 % 128;
            int i10 = i9 % 2;
            qualityAddedEncoderProfilesProvider = qualityAddedEncoderProfilesProviderB;
        }
        if (strTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            String iNotificationSideChannel3 = qualityAddedEncoderProfilesProvider.getDescriptor().getINotificationSideChannel();
            fromid.asBinder = strTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            fromid.g = iNotificationSideChannel3;
        }
        qualityAddedEncoderProfilesProvider.serialize(fromid2, obj);
        return null;
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeChar(char c) throws Throwable {
        Object[] objArr;
        char c2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int iIndexOf = 651 - TextUtils.indexOf("", "", 0);
            int mirror = '\\' - AndroidCharacter.getMirror('0');
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, b, bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, iIndexOf, mirror, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(null, null, 127 - KeyEvent.getDeadChar(0, 0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(null, null, ExpandableListView.getPackedPositionGroup(0L) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int i2 = 652 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int mode = View.MeasureSpec.getMode(0) + 44;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr2[5], (byte) 52, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(jumpTapTimeout, i2, mode, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c4 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int scrollBarSize = 651 - (ViewConfiguration.getScrollBarSize() >> 8);
                int iBlue = 44 - Color.blue(0);
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                c(b3, (byte) (b3 | 15), b2, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c4, scrollBarSize, iBlue, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i3 = ((int[]) objArr7[2])[0];
            int i4 = ((int[]) objArr7[0])[0];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i5 = ~startUptimeMillis;
            int i6 = (-1460158451) + (((~((-124766558) | i5)) | 128197367) * (-328)) + ((startUptimeMillis | 128197367) * 164) + (((~(startUptimeMillis | 124766557)) | 8397474 | (~(i5 | (-4966665)))) * 164) + 201405821;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[3])[0] = i8 ^ (i8 << 5);
            c2 = 2;
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), 1609 - MotionEvent.axisFromString(""), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 25, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 201405821, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cRed = (char) Color.red(0);
                    int iBlue2 = 651 - Color.blue(0);
                    int iArgb = 44 - Color.argb(0, 0, 0, 0);
                    byte[] bArr3 = $$a;
                    Object[] objArr9 = new Object[1];
                    c(bArr3[5], (byte) 52, bArr3[7], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRed, iBlue2, iArgb, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.getMaxKeyCode() >> 16), View.MeasureSpec.getMode(0) + 695, 99 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - KeyEvent.keyCodeFromString("")), Gravity.getAbsoluteGravity(0, 0) + 793, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 83), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                    int windowTouchSlop = 651 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int iIndexOf2 = 43 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr10 = new Object[1];
                    c(b5, (byte) (b5 | 15), b4, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar, windowTouchSlop, iIndexOf2, -1595579076, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    e(null, null, TextUtils.lastIndexOf("", '0', 0, 0) + 128, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    e(null, null, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 651;
                        int touchSlop2 = 44 - (ViewConfiguration.getTouchSlop() >> 8);
                        byte[] bArr4 = $$a;
                        Object[] objArr13 = new Object[1];
                        c(bArr4[5], (byte) 52, bArr4[7], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(offsetAfter, touchSlop, touchSlop2, -873460649, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char defaultSize = (char) View.getDefaultSize(0, 0);
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 651;
                        int gidForName = 43 - Process.getGidForName("");
                        byte[] bArr5 = $$a;
                        byte b6 = bArr5[7];
                        Object[] objArr14 = new Object[1];
                        c(b6, b6, bArr5[5], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(defaultSize, scrollDefaultDelay, gidForName, -459846511, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    int i9 = notify + 61;
                    cancel = i9 % 128;
                    c2 = 2;
                    int i10 = i9 % 2;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i11 = ((int[]) objArr[0])[0];
        int i12 = ((int[]) objArr[c2])[0];
        if (i12 == i11) {
            Object[] objArr15 = new Object[4];
            objArr15[0] = new int[]{i};
            objArr15[c2] = new int[]{i};
            objArr15[3] = new int[1];
            int i13 = ((int[]) objArr[3])[0];
            int i14 = ((int[]) objArr[c2])[0];
            int i15 = ((int[]) objArr[0])[0];
            objArr15[1] = new String[0];
            int i16 = ~((int) Runtime.getRuntime().freeMemory());
            int i17 = i13 + 1708700315 + (((-352393222) | i16) * 494) + (((~(i16 | (-357646102))) | 13936570) * 494);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr15[3])[0] = i19 ^ (i19 << 5);
            int i20 = cancel + 89;
            notify = i20 % 128;
            int i21 = i20 % 2;
            encodeString(String.valueOf(c));
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[1];
        if (strArr != null) {
            for (String str : strArr) {
                arrayList.add(str);
            }
        }
        throw new RuntimeException(String.valueOf(i12));
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeString(String str) {
        int i = 2 % 2;
        int i2 = notify + 27;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        int i4 = cancel + 97;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeByte(byte b) {
        Object[] objArr = {this, Byte.valueOf(b)};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1926090360, objArr, zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 1926090363);
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeEnum(createImageAnalysis createimageanalysis, int i) {
        Object[] objArr = {this, createimageanalysis, Integer.valueOf(i)};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 107014007, objArr, zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -107014005);
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeFloat(float f) {
        Object[] objArr = {this, Float.valueOf(f)};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1589102330, objArr, zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1589102329);
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final <T> void encodeSerializableValue(QualityAddedEncoderProfilesProvider<? super T> qualityAddedEncoderProfilesProvider, T t) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1777162073, new Object[]{this, qualityAddedEncoderProfilesProvider, t}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1777162073);
    }

    private static String $$e(byte b, int i, byte b2) {
        int i2 = i * 3;
        byte[] bArr = $$c;
        int i3 = b + 67;
        int i4 = 4 - (b2 * 2);
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4++;
            i3 = i2 + (-i4);
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i4];
            i4++;
            i3 += -b3;
        }
    }
}
