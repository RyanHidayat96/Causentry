package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.app.ActivityCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.data.payment.model.response.RecurringPlanResponse;
import com.esafirm.imagepicker.features.ImagePickerConfig;
import com.esafirm.imagepicker.features.ImagePickerSavePath;
import com.esafirm.imagepicker.features.camera.DefaultCameraModule;
import com.esafirm.imagepicker.features.cameraonly.CameraOnlyConfig;
import com.esafirm.imagepicker.features.common.BaseConfig;
import com.esafirm.imagepicker.model.Image;
import com.esafirm.imagepicker.view.SnackBarView;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public class submitProcessingRequest extends Fragment implements JpegBytes2DiskIn {
    private NoMetadataImageReaderExternalSyntheticLambda0 INotificationSideChannel;
    public TextView TuitionPaymentFragmentbindingInflater1;
    public copyTempFileToUri TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public ProgressBar TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public copyFileToMediaStore TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public clearProcessingRequest f1409a;
    public RecyclerView asBinder;
    private ImagePickerConfig asInterface;
    public boolean b;
    private SnackBarView cancelAll;
    private Handler d;
    private getUpdatedTransform g;
    private ContentObserver notify;
    private static final byte[] $$c = {117, 50, 102, 124};
    private static final int $$d = 196;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {49, 84, -120, 101, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 55;
    private static int INotificationSideChannelStubProxy = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static long cancel = -6377398940819159759L;
    private static int onTransact = -981105359;
    private static char INotificationSideChannelDefault = 37887;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        int iIntValue;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = ~i2;
        int i12 = ~i3;
        int i13 = (~(i11 | i12)) | i;
        int i14 = i3 | i11;
        int i15 = (~(i3 | i)) | (~(i11 | (~i) | i12)) | (~(i | i2));
        int i16 = i + i2 + i6 + (764943627 * i4) + (189947931 * i5);
        int i17 = i16 * i16;
        int i18 = (i * 1860537600) + 224780607 + (i2 * 1860537600) + (i13 * 1034) + (i14 * (-517)) + (i15 * 517) + (1860538117 * i6) + ((-1861700041) * i4) + ((-831392377) * i5) + (i17 * 995229696);
        int i19 = ((i * (-973936384)) - 801505280) + ((-973936384) * i2) + (1838296578 * i13) + (1228335359 * i14) + ((-1228335359) * i15) + (2092695552 * i6) + ((-1475084288) * i4) + ((-1479278592) * i5) + ((-626393088) * i17) + (i18 * i18 * 1053163520);
        if (i19 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i19 != 2) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        submitProcessingRequest submitprocessingrequest = (submitProcessingRequest) objArr[0];
        int i20 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 46401), (ViewConfiguration.getTapTimeout() >> 16) + 40, 19 - Color.red(0), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i21 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr2 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{15784, 41507, 57250, 53326}, (char) Color.blue(0), '0' - AndroidCharacter.getMirror('0'), new char[]{1367, 39098, 63075, 25286, 58146, 1096, 55273, 25045, 1613, 36165, 27261, 3146, 1094, 31043, 35839, 562, 29456, 14067, 43757, 13045, 55113, 24575}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{41259, 27756, 20424, 37905}, (char) (TextUtils.lastIndexOf("", '0', 0) + 4432), (-932418399) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{18306, 17495, 64635, 4634, 35801, 55027, 21785, 4308, 51084, 41414, 16312, 9763, 6806, 25471, 25433}, objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = 988;
        long j2 = -1;
        long j3 = j2 ^ 1549873552604897715L;
        long startUptimeMillis = (int) Process.getStartUptimeMillis();
        long j4 = startUptimeMillis ^ j2;
        long j5 = (((long) 989) * 547383622137061272L) + (((long) (-987)) * 1549873552604897715L) + (((((j3 | j4) | 547383622137061272L) ^ j2) | ((1700939857487577019L | startUptimeMillis) ^ j2)) * j) + (((long) (-988)) * (j3 | 547383622137061272L)) + (j * ((((j2 ^ 547383622137061272L) | j3) ^ j2) | ((j3 | startUptimeMillis) ^ j2) | (j2 ^ (j4 | 1700939857487577019L))));
        long j6 = jLongValue;
        int i22 = 0;
        try {
            while (i22 != 10) {
                int i23 = RemoteActionCompatParcelizer + 113;
                INotificationSideChannelStubProxy = i23 % 128;
                if (i23 % 2 != 0) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (AndroidCharacter.getMirror('0') + 37788), 58 - ExpandableListView.getPackedPositionChild(0L), TextUtils.lastIndexOf("", '0') + 19, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    i7 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                    i8 = 1;
                } else {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-16739380) - Color.rgb(0, 0, 0)), 59 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 17 - MotionEvent.axisFromString(""), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    i7 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
                    i8 = 0;
                }
                while (true) {
                    int i24 = RemoteActionCompatParcelizer + 95;
                    INotificationSideChannelStubProxy = i24 % 128;
                    if (i24 % 2 != 0) {
                        int i25 = 5 % 2;
                    }
                    i9 = i7;
                    int i26 = 0;
                    while (i26 != 8) {
                        int i27 = INotificationSideChannelStubProxy + 89;
                        RemoteActionCompatParcelizer = i27 % 128;
                        if (i27 % 2 == 0) {
                            i10 = (((((int) (j6 >> i26)) & 1916) >>> (i9 * 106)) - (i9 << 20)) / i9;
                            i26 += 88;
                        } else {
                            i10 = (((((int) (j6 >> i26)) & 255) + (i9 << 6)) + (i9 << 16)) - i9;
                            i26++;
                        }
                        i9 = i10;
                    }
                    if (i8 != 0) {
                        break;
                    }
                    i8++;
                    i7 = i9;
                    j6 = j5;
                }
                if (i9 == i21) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", submitprocessingrequest.getActivity().getPackageName(), null));
                    intent.addFlags(268435456);
                    submitprocessingrequest.startActivity(intent);
                    return null;
                }
                j6 -= 1024;
                i22++;
                int i28 = INotificationSideChannelStubProxy + 121;
                RemoteActionCompatParcelizer = i28 % 128;
                int i29 = i28 % 2;
            }
            Object[] objArr4 = {1450752299};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 46038), 1133 - ((byte) KeyEvent.getModifierMetaStateMask()), 17 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr5 = {Integer.valueOf(iIntValue), 0, 1689872392, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr4), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                int tapTimeout = 1031 - (ViewConfiguration.getTapTimeout() >> 16);
                int i30 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                byte[] bArr = $$a;
                byte b = bArr[7];
                Object[] objArr6 = new Object[1];
                e(b, b, (byte) (-bArr[5]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSizeAndState, tapTimeout, i30, 1298546779, false, (String) objArr6[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.MeasureSpec.getMode(0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1117, 16 - Process.getGidForName("")), Boolean.TYPE});
            }
            Object[] objArr7 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr5);
            int i31 = ((int[]) objArr7[1])[0];
            int i32 = ((int[]) objArr7[3])[0];
            if (i32 != i31) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr7[0];
                if (strArr != null) {
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                throw new RuntimeException(String.valueOf(i32));
            }
            Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", submitprocessingrequest.getActivity().getPackageName(), null));
            intent2.addFlags(268435456);
            submitprocessingrequest.startActivity(intent2);
            return null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        Object[] objArr8 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{49584, 57838, 30614, 6291}, (char) (37752 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 1, new char[]{26833, 19004, 7939, 27580, 50133, 52181, 26717, 23634, 64874, 51309, 58922, 15945, 35398, 31897, 38749, 35621}, objArr8);
        Class<?> cls2 = Class.forName((String) objArr8[0]);
        Object[] objArr9 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{52740, 7383, 22172, 61551}, (char) (28502 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, new char[]{55330, 29403, 34788, 35110, 10730, 55440, 20263, 7216, 63839, 23808, 52075, 23231, 62550, 33811, 63566, 1943}, objArr9);
        iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, submitprocessingrequest)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r6 = r6 * 2
            int r0 = 53 - r6
            int r7 = r7 * 3
            int r7 = r7 + 84
            byte[] r1 = defpackage.submitProcessingRequest.$$a
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L30
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-11)
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.submitProcessingRequest.e(int, byte, byte, java.lang.Object[]):void");
    }

    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(submitProcessingRequest submitprocessingrequest) {
        int i = 2 % 2;
        JpegBytes2Image jpegBytes2Image = submitprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
        ExecutorService executorService = jpegBytes2Image.TuitionPaymentFragmentbindingInflater1;
        if (executorService != null) {
            int i2 = RemoteActionCompatParcelizer + 23;
            INotificationSideChannelStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                executorService.shutdown();
                jpegBytes2Image.TuitionPaymentFragmentbindingInflater1 = null;
                int i3 = 26 / 0;
            } else {
                executorService.shutdown();
                jpegBytes2Image.TuitionPaymentFragmentbindingInflater1 = null;
            }
        }
        ImagePickerConfig imagePickerConfigB = submitprocessingrequest.b();
        if (imagePickerConfigB != null) {
            submitprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imagePickerConfigB);
            int i4 = INotificationSideChannelStubProxy + 15;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public submitProcessingRequest() {
        if (getUpdatedTransform.b == null) {
            getUpdatedTransform.b = new getUpdatedTransform();
            int i = INotificationSideChannelStubProxy + 7;
            RemoteActionCompatParcelizer = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        this.g = getUpdatedTransform.b;
        int i4 = INotificationSideChannelStubProxy + 103;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static submitProcessingRequest TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImagePickerConfig imagePickerConfig, CameraOnlyConfig cameraOnlyConfig) {
        int i = 2 % 2;
        submitProcessingRequest submitprocessingrequest = new submitProcessingRequest();
        Bundle bundle = new Bundle();
        if (imagePickerConfig != null) {
            int i2 = INotificationSideChannelStubProxy + 19;
            RemoteActionCompatParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                bundle.putParcelable("ImagePickerConfig", imagePickerConfig);
                throw null;
            }
            bundle.putParcelable("ImagePickerConfig", imagePickerConfig);
        }
        if (cameraOnlyConfig != null) {
            bundle.putParcelable("CameraOnlyConfig", cameraOnlyConfig);
            int i3 = RemoteActionCompatParcelizer + 123;
            INotificationSideChannelStubProxy = i3 % 128;
            int i4 = i3 % 2;
        }
        submitprocessingrequest.setArguments(bundle);
        return submitprocessingrequest;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Throwable {
        int i = 2 % 2;
        this.INotificationSideChannel = new NoMetadataImageReaderExternalSyntheticLambda0(getActivity());
        copyTempFileToUri copytempfiletouri = new copyTempFileToUri(new JpegBytes2Image(getActivity()));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = copytempfiletouri;
        copytempfiletouri.TuitionPaymentFragmentbindingInflater1 = this;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            throw new RuntimeException("ImagePickerFragment needs an ImagePickerInteractionListener. This will be set automatically if the activity implements ImagePickerInteractionListener, and can be set manually with fragment.setInteractionListener(listener).");
        }
        if (bundle != null) {
            int i2 = INotificationSideChannelStubProxy + 1;
            RemoteActionCompatParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (DefaultCameraModule) bundle.getSerializable("Key.CameraModule");
                throw null;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (DefaultCameraModule) bundle.getSerializable("Key.CameraModule");
        }
        if (this.b) {
            if (bundle == null) {
                int i3 = INotificationSideChannelStubProxy + 15;
                RemoteActionCompatParcelizer = i3 % 128;
                if (i3 % 2 == 0) {
                    TuitionPaymentFragmentbindingInflater1();
                    throw null;
                }
                TuitionPaymentFragmentbindingInflater1();
            }
            int i4 = RemoteActionCompatParcelizer + 115;
            INotificationSideChannelStubProxy = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        ImagePickerConfig imagePickerConfigB = b();
        if (imagePickerConfigB == null) {
            throw new IllegalStateException("This should not happen. Please open an issue!");
        }
        View viewInflate = layoutInflater.cloneInContext(new ContextThemeWrapper(getActivity(), imagePickerConfigB.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).inflate(R.layout.ef_fragment_image_picker, viewGroup, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (ProgressBar) viewInflate.findViewById(R.id.progress_bar);
        this.TuitionPaymentFragmentbindingInflater1 = (TextView) viewInflate.findViewById(R.id.tv_empty_images);
        this.asBinder = (RecyclerView) viewInflate.findViewById(R.id.recyclerView);
        this.cancelAll = (SnackBarView) viewInflate.findViewById(R.id.ef_snackbar);
        if (bundle == null) {
            TuitionPaymentFragmentbindingInflater1(imagePickerConfigB, imagePickerConfigB.onTransact);
        } else {
            TuitionPaymentFragmentbindingInflater1(imagePickerConfigB, bundle.getParcelableArrayList("Key.SelectedImages"));
            clearProcessingRequest clearprocessingrequest = this.f1409a;
            clearprocessingrequest.g.onRestoreInstanceState(bundle.getParcelable("Key.Recycler"));
            int i6 = INotificationSideChannelStubProxy + 21;
            RemoteActionCompatParcelizer = i6 % 128;
            int i7 = i6 % 2;
        }
        clearProcessingRequest clearprocessingrequest2 = this.f1409a;
        if (clearprocessingrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            throw new IllegalStateException("Must call setupAdapters first!");
        }
        List<Image> list = clearprocessingrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return viewInflate;
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $10 + 39;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) i2;
                    byte b2 = (byte) (b - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.resolveSize(0, 0) + 8328), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1234, 35 - (Process.myTid() >> 22), -653973969, false, $$e(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), (Process.myTid() >> 22) + 2764, 14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1504416861, false, $$e(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - Color.blue(0)), 253 - KeyEvent.normalizeMetaState(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b5 = (byte) 1;
                                byte b6 = (byte) (-b5);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.resolveSizeAndState(0, 0, 0) + 65200), ((byte) KeyEvent.getModifierMetaStateMask()) + 2892, (ViewConfiguration.getWindowTouchSlop() >> 8) + 17, 2012627446, false, $$e(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (cancel ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) onTransact) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) INotificationSideChannelDefault) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
        int i6 = $11 + 115;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        boolean zContainsKey = getArguments().containsKey("CameraOnlyConfig");
        this.b = zContainsKey;
        if (zContainsKey) {
            return;
        }
        if (this.d == null) {
            this.d = new Handler();
            int i2 = INotificationSideChannelStubProxy + 101;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
        }
        this.notify = new ContentObserver(this.d) { // from class: submitProcessingRequest.2
            private static final byte[] $$c = {74, 60, 122, -26};
            private static final int $$f = 152;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {83, ByteCompanionObject.MIN_VALUE, -37, -48, -46, -2, -9, 7, -16, 35, -39, -25, 23, -41, -13, 5, -1, 26, -52, -6, -11, 7, -21, -3, -14, -7, 33, -59, -4, 7, -21, -4, 5, -19, 17, -46, 3, -14, 4, -5, -23, 3, -2, 15, -29, -20, 3, -10, -5, 41, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 59};
            private static final int $$e = 245;
            private static final byte[] $$a = {8, -36, 87, -65, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
            private static final int $$b = 150;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static char[] TuitionPaymentFragmentbindingInflater1 = {60056, 60040, 60050, 59746, 60045, 60041, 60047, 60049, 60083, 60059, 60046, 59749, 60053, 60058, 59744, 60088, 59751, 60079, 60055, 60062, 60048, 59748, 60052, 60063, 59747, 60117, 60073, 60054, 60061, 60034, 60090, 60051, 60072, 60043, 60060, 59745};
            private static char b = 57191;

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r5, int r6, short r7, java.lang.Object[] r8) {
                /*
                    int r6 = r6 * 15
                    int r0 = 53 - r6
                    byte[] r1 = defpackage.submitProcessingRequest.AnonymousClass2.$$a
                    int r5 = 92 - r5
                    int r7 = r7 * 2
                    int r7 = 84 - r7
                    byte[] r0 = new byte[r0]
                    int r6 = 52 - r6
                    r2 = 0
                    if (r1 != 0) goto L17
                    r3 = r7
                    r4 = r2
                    r7 = r6
                    goto L2b
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    int r5 = r5 + 1
                    int r4 = r3 + 1
                    if (r3 != r6) goto L29
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    r8[r2] = r5
                    return
                L29:
                    r3 = r1[r5]
                L2b:
                    int r7 = r7 + r3
                    int r7 = r7 + (-11)
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.submitProcessingRequest.AnonymousClass2.a(short, int, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(int r6, int r7, int r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = defpackage.submitProcessingRequest.AnonymousClass2.$$d
                    int r7 = r7 * 6
                    int r7 = 53 - r7
                    int r8 = r8 + 83
                    int r6 = r6 * 46
                    int r6 = r6 + 4
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r7
                    r4 = r2
                    goto L2a
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r7) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L24:
                    r4 = r0[r6]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2a:
                    int r8 = -r8
                    int r3 = r3 + r8
                    int r6 = r6 + 1
                    int r8 = r3 + (-8)
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.submitProcessingRequest.AnonymousClass2.d(int, int, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:46:0x018a  */
            /* JADX WARN: Code duplicated, block: B:47:0x01a2  */
            /* JADX WARN: Code duplicated, block: B:50:0x01ed A[Catch: all -> 0x03ca, TryCatch #0 {all -> 0x03ca, blocks: (B:13:0x0041, B:15:0x004f, B:16:0x0082, B:19:0x0095, B:21:0x00a6, B:22:0x00d9, B:27:0x00f2, B:29:0x0105, B:30:0x0132, B:48:0x01a4, B:50:0x01ed, B:51:0x025e, B:55:0x0273, B:57:0x02af, B:59:0x031d), top: B:78:0x0041 }] */
            /* JADX WARN: Code duplicated, block: B:54:0x0271  */
            /* JADX WARN: Code duplicated, block: B:57:0x02af A[Catch: all -> 0x03ca, TryCatch #0 {all -> 0x03ca, blocks: (B:13:0x0041, B:15:0x004f, B:16:0x0082, B:19:0x0095, B:21:0x00a6, B:22:0x00d9, B:27:0x00f2, B:29:0x0105, B:30:0x0132, B:48:0x01a4, B:50:0x01ed, B:51:0x025e, B:55:0x0273, B:57:0x02af, B:59:0x031d), top: B:78:0x0041 }] */
            /* JADX WARN: Code duplicated, block: B:58:0x031b  */
            /* JADX WARN: Code duplicated, block: B:61:0x033e  */
            /* JADX WARN: Code duplicated, block: B:63:0x0347  */
            /* JADX WARN: Code duplicated, block: B:65:0x0384  */
            /* JADX WARN: Code duplicated, block: B:66:0x0387  */
            /* JADX WARN: Code duplicated, block: B:87:0x03a0 A[SYNTHETIC] */
            private static void c(char[] cArr, byte b2, int i4, Object[] objArr) throws Throwable {
                int i5;
                Object obj;
                Object[] objArr2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i6;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int length;
                char[] cArr2;
                int i7;
                int i8 = 2;
                int i9 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr3 = TuitionPaymentFragmentbindingInflater1;
                int i10 = 1770390596;
                Object obj2 = null;
                if (cArr3 != null) {
                    int i11 = $11 + 11;
                    int i12 = i11 % 128;
                    $10 = i12;
                    if (i11 % 2 != 0) {
                        length = cArr3.length;
                        cArr2 = new char[length];
                        i7 = 1;
                    } else {
                        length = cArr3.length;
                        cArr2 = new char[length];
                        i7 = 0;
                    }
                    int i13 = i12 + 119;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    while (i7 < length) {
                        int i15 = $11 + 77;
                        $10 = i15 % 128;
                        if (i15 % i8 != 0) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(cArr3[i7])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i10);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = b3;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.rgb(0, 0, 0) + 16777216), (ViewConfiguration.getPressedStateDuration() >> 16) + 2267, Process.getGidForName("") + 34, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                                }
                                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                                i7 %= 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr4 = {Integer.valueOf(cArr3[i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) Color.blue(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2267, 34 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
                            i7++;
                        }
                        i8 = 2;
                        i10 = 1770390596;
                    }
                    cArr3 = cArr2;
                }
                Object[] objArr5 = {Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                char c = '0';
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2268, TextUtils.indexOf("", "") + 33, -1927765101, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr5)).charValue();
                char[] cArr4 = new char[i4];
                if (i4 % 2 != 0) {
                    i5 = i4 - 1;
                    cArr4[i5] = (char) (cArr[i5] - b2);
                } else {
                    i5 = i4;
                }
                if (i5 > 1) {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i5) {
                        int i16 = $11 + 19;
                        $10 = i16 % 128;
                        if (i16 % 2 != 0) {
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 % 1];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                obj = obj2;
                            } else {
                                objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b9 = (byte) 1;
                                    byte b10 = (byte) (b9 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49266 - TextUtils.indexOf("", c, 0)), 3261 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 30, -127612708, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                    Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        byte b11 = (byte) 3;
                                        byte b12 = (byte) (b11 - 3);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22878 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 593, View.resolveSizeAndState(0, 0, 0) + 17, 1570859318, false, $$g(b11, b12, b12), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                    int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i17];
                                } else {
                                    obj = null;
                                    if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                        int i18 = $10 + 71;
                                        $11 = i18 % 128;
                                        int i19 = i18 % 2;
                                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                        int i20 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                        int i21 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i20];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i21];
                                        i6 = $10 + 93;
                                        $11 = i6 % 128;
                                        if (i6 % 2 == 0) {
                                            int i22 = 4 / 4;
                                        }
                                    } else {
                                        int i23 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                        int i24 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i23];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i24];
                                    }
                                }
                            }
                        } else {
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                obj = obj2;
                            } else {
                                objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b13 = (byte) 1;
                                    byte b14 = (byte) (b13 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49266 - TextUtils.indexOf("", c, 0)), 3261 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 30, -127612708, false, $$g(b13, b14, b14), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                    Object[] objArr7 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        byte b15 = (byte) 3;
                                        byte b16 = (byte) (b15 - 3);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22878 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 593, View.resolveSizeAndState(0, 0, 0) + 17, 1570859318, false, $$g(b15, b16, b16), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr7)).intValue();
                                    int i110 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue2];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i110];
                                } else {
                                    obj = null;
                                    if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                        int i111 = $10 + 71;
                                        $11 = i111 % 128;
                                        int i112 = i111 % 2;
                                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                        int i25 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                        int i26 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i25];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i26];
                                        i6 = $10 + 93;
                                        $11 = i6 % 128;
                                        if (i6 % 2 == 0) {
                                            int i27 = 4 / 4;
                                        }
                                    } else {
                                        int i28 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                        int i29 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i28];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i29];
                                    }
                                }
                            }
                        }
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                        obj2 = obj;
                        c = '0';
                    }
                }
                int i30 = $10 + 23;
                $11 = i30 % 128;
                int i31 = i30 % 2;
                for (int i32 = 0; i32 < i4; i32++) {
                    cArr4[i32] = (char) (cArr4[i32] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            }

            /* JADX WARN: Code duplicated, block: B:24:0x0216  */
            /* JADX WARN: Code duplicated, block: B:27:0x0228  */
            @Override // android.database.ContentObserver
            public final void onChange(boolean z) throws Throwable {
                Object[] objArr;
                int i4 = 2 % 2;
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                    int i7 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 875;
                    int iIndexOf = TextUtils.indexOf("", "", 0) + 10;
                    byte[] bArr = $$a;
                    Object[] objArr2 = new Object[1];
                    a((byte) 89, bArr[28], bArr[7], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i7, iIndexOf, -1650998592, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{14, '\r', 29, 11, 20, 4, 19, 29, 19, 4, 26, 31, 25, 5, 7, 18, '!', 21, 19, 23, 2, 18}, (byte) (110 - (ViewConfiguration.getFadingEdgeLength() >> 16)), ExpandableListView.getPackedPositionGroup(0L) + 22, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{20, 19, 15, 31, 7, 25, 20, 29, 25, 19, 24, '\f', 3, 26, 13935}, (byte) (Color.blue(0) + 112), 15 - (ViewConfiguration.getTouchSlop() >> 8), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cAlpha = (char) Color.alpha(0);
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 876;
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 10;
                    byte b2 = $$a[7];
                    Object[] objArr5 = new Object[1];
                    a((byte) 52, b2, b2, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha, pressedStateDuration, packedPositionGroup, 2012020043, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        int i8 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 875;
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 10;
                        byte b3 = $$a[7];
                        byte b4 = b3;
                        Object[] objArr6 = new Object[1];
                        a(b3, b4, b4, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, i8, tapTimeout, 2012931276, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                    int i9 = ~System.identityHashCode(this);
                    int i10 = ((((~((-96586199) | i9)) | 75581910) * (-241)) - 1506307934) + (((~(i9 | (-21004289))) | (-131857880)) * 241) + 1430167982;
                    int i11 = (i10 << 13) ^ i10;
                    int i12 = i11 ^ (i11 >>> 17);
                    ((int[]) objArr[1])[0] = i12 ^ (i12 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{14, '\r', 29, 11, 20, 4, 19, 29, 15, 31, 31, 27, 0, 6, '\b', 0, 5, 3, 11, 24, '\r', '#', 1, 23, 17, 19}, (byte) (14 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{4, 6, 13829, 13829, 18, '\r', '\f', 0, 13831, 13831, 20, 0, 1, '\f', '\b', 0, 18, 16}, (byte) (29 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 17, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
                        int i14 = i13 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14;
                        if (i13 % 2 != 0) {
                            int i15 = 55 / 0;
                            if (applicationContext instanceof ContextWrapper) {
                                int i16 = i14 + 81;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
                                int i17 = i16 % 2;
                                if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                    applicationContext = null;
                                }
                            }
                        } else if (applicationContext instanceof ContextWrapper) {
                            int i18 = i14 + 81;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                            int i19 = i18 % 2;
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = null;
                            }
                        }
                        applicationContext = applicationContext.getApplicationContext();
                    }
                    Object[] objArr10 = new Object[1];
                    c(new char[]{'\r', 19, 1, 16, 24, 19, 14, '\r', 31, 28, '#', 26, 0, 7, 21, 25}, (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 38), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{5, 20, 18, '\r', '\b', 0, 11, 24, 7, 14, 7, 1, 16, 21, 18, 20}, (byte) (Color.blue(0) + 93), KeyEvent.getDeadChar(0, 0) + 16, objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
                    int i21 = i20 % 2;
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1430167982};
                        byte[] bArr2 = $$d;
                        byte b5 = bArr2[60];
                        Object[] objArr13 = new Object[1];
                        d(b5, bArr2[83], b5, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b6 = bArr2[83];
                        Object[] objArr14 = new Object[1];
                        d(b6, bArr2[60], b6, objArr14);
                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        if (applicationContext != null) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 876;
                                int iIndexOf2 = TextUtils.indexOf("", "", 0) + 10;
                                byte b7 = $$a[7];
                                byte b8 = b7;
                                Object[] objArr16 = new Object[1];
                                a(b7, b8, b8, objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cCombineMeasuredStates, tapTimeout2, iIndexOf2, 2012931276, false, (String) objArr16[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                            try {
                                Object[] objArr17 = new Object[1];
                                c(new char[]{14, '\r', 29, 11, 20, 4, 19, 29, 19, 4, 26, 31, 25, 5, 7, 18, '!', 21, 19, 23, 2, 18}, (byte) (109 - TextUtils.indexOf((CharSequence) "", '0')), 22 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr17);
                                Class<?> cls5 = Class.forName((String) objArr17[0]);
                                Object[] objArr18 = new Object[1];
                                c(new char[]{20, 19, 15, 31, 7, 25, 20, 29, 25, 19, 24, '\f', 3, 26, 13935}, (byte) (TextUtils.getOffsetAfter("", 0) + 112), 15 - (Process.myTid() >> 22), objArr18);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                    int scrollDefaultDelay = 876 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                    int i22 = 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                    byte b9 = $$a[7];
                                    Object[] objArr19 = new Object[1];
                                    a((byte) 52, b9, b9, objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, scrollDefaultDelay, i22, 2012020043, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 876;
                                    int i23 = 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                    byte[] bArr3 = $$a;
                                    Object[] objArr20 = new Object[1];
                                    a((byte) 89, bArr3[28], bArr3[7], objArr20);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(doubleTapTimeout, iKeyCodeFromString, i23, -1650998592, false, (String) objArr20[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                        objArr = objArr15;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i24 = ((int[]) objArr[2])[0];
                int i25 = ((int[]) objArr[0])[0];
                if (i25 != i24) {
                    throw new RuntimeException(String.valueOf(i25));
                }
                int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i26 % 128;
                int i27 = i26 % 2;
                int i28 = ((int[]) objArr[1])[0];
                Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i29 = ~elapsedCpuTime;
                int i30 = i28 + 1466369812 + (((~(i29 | 655754876)) | (~(615444647 | i29)) | (-666826496)) * 464) + (((-51381849) | elapsedCpuTime) * (-464)) + (((~(elapsedCpuTime | 655754876)) | (-666826496)) * 464);
                int i31 = (i30 << 13) ^ i30;
                int i32 = i31 ^ (i31 >>> 17);
                ((int[]) objArr21[1])[0] = i32 ^ (i32 << 5);
                int i33 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i33 % 128;
                int i34 = i33 % 2;
                submitProcessingRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1(submitProcessingRequest.this);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r6, int r7, short r8) {
                /*
                    int r6 = r6 + 113
                    int r7 = r7 * 2
                    int r7 = r7 + 4
                    int r8 = r8 * 4
                    int r8 = 1 - r8
                    byte[] r0 = defpackage.submitProcessingRequest.AnonymousClass2.$$c
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r7
                    r7 = r8
                    r4 = r2
                    goto L2a
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r8) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L23:
                    r4 = r0[r7]
                    r5 = r7
                    r7 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L2a:
                    int r3 = r3 + 1
                    int r6 = -r6
                    int r6 = r6 + r7
                    r7 = r3
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.submitProcessingRequest.AnonymousClass2.$$g(byte, int, short):java.lang.String");
            }
        };
        getActivity().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, false, this.notify);
        int i4 = RemoteActionCompatParcelizer + 107;
        INotificationSideChannelStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public final ImagePickerConfig b() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 93;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        if (this.asInterface == null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                throw new IllegalStateException("This should not happen. Please open an issue!");
            }
            boolean zContainsKey = arguments.containsKey("ImagePickerConfig");
            if (!arguments.containsKey("ImagePickerConfig")) {
                int i4 = INotificationSideChannelStubProxy + 33;
                RemoteActionCompatParcelizer = i4 % 128;
                if (i4 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!zContainsKey) {
                    throw new IllegalStateException("This should not happen. Please open an issue!");
                }
            }
            this.asInterface = (ImagePickerConfig) arguments.getParcelable("ImagePickerConfig");
        }
        ImagePickerConfig imagePickerConfig = this.asInterface;
        int i5 = INotificationSideChannelStubProxy + 47;
        RemoteActionCompatParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 11 / 0;
        }
        return imagePickerConfig;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
    private void TuitionPaymentFragmentbindingInflater1(final ImagePickerConfig imagePickerConfig, ArrayList<Image> arrayList) {
        int i = 2 % 2;
        final clearProcessingRequest clearprocessingrequest = new clearProcessingRequest(this.asBinder, imagePickerConfig, getResources().getConfiguration().orientation);
        this.f1409a = clearprocessingrequest;
        ProcessingNode processingNode = new ProcessingNode() { // from class: JpegBytes2Disk
            @Override // defpackage.ProcessingNode
            public final boolean TuitionPaymentFragmentbindingInflater1(boolean z) {
                clearProcessingRequest clearprocessingrequest2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f1409a;
                if (clearprocessingrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INotificationSideChannel == 2) {
                    if (clearprocessingrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() >= clearprocessingrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.d && !z) {
                        Toast.makeText(clearprocessingrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, R.string.ef_msg_limit_images, 0).show();
                        return false;
                    }
                } else if (clearprocessingrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INotificationSideChannel == 1 && clearprocessingrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
                    final ImagePipeline imagePipeline = clearprocessingrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    new Runnable() { // from class: getProcessingNode
                        @Override // java.lang.Runnable
                        public final void run() {
                            ImagePipeline imagePipeline2 = imagePipeline;
                            imagePipeline2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.clear();
                            imagePipeline2.notifyDataSetChanged();
                        }
                    }.run();
                    getRotatedSize getrotatedsize = imagePipeline.b;
                    if (getrotatedsize != null) {
                        getrotatedsize.b(imagePipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    }
                }
                return true;
            }
        };
        final getCameraCaptureResult getcameracaptureresult = new getCameraCaptureResult() { // from class: copyFileToFile
            @Override // defpackage.getCameraCaptureResult
            public final void b(lambdaprocessInputPacket5 lambdaprocessinputpacket5) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaprocessinputpacket5.b());
            }
        };
        if (clearprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INotificationSideChannel == 1) {
            int i2 = RemoteActionCompatParcelizer;
            int i3 = i2 + 9;
            INotificationSideChannelStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 15 / 0;
                if (arrayList != null) {
                    int i5 = i2 + 23;
                    INotificationSideChannelStubProxy = i5 % 128;
                    if (i5 % 2 != 0 ? arrayList.size() > 1 : arrayList.size() > 0) {
                    }
                }
            } else if (arrayList != null) {
                int i6 = i2 + 23;
                INotificationSideChannelStubProxy = i6 % 128;
                arrayList = i6 % 2 != 0 ? null : null;
            }
        }
        if (createCroppedBitmap.TuitionPaymentFragmentbindingInflater1 == null) {
            createCroppedBitmap.TuitionPaymentFragmentbindingInflater1 = new createCroppedBitmap();
        }
        createCroppedBitmap createcroppedbitmap = createCroppedBitmap.TuitionPaymentFragmentbindingInflater1;
        JpegImage2Result jpegImage2Result = createcroppedbitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (createcroppedbitmap.b == null) {
            createcroppedbitmap.b = new acceptProcessingRequest();
        }
        JpegImage2Result jpegImage2Result2 = createcroppedbitmap.b;
        clearprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ImagePipeline(clearprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3, jpegImage2Result2, arrayList, processingNode);
        clearprocessingrequest.TuitionPaymentFragmentbindingInflater1 = new createProcessingRequest(clearprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3, jpegImage2Result2, new getCameraCaptureResult() { // from class: lambdasetOnImageAvailableListener0androidxcameracoreimagecaptureNoMetadataImageReader
            @Override // defpackage.getCameraCaptureResult
            public final void b(lambdaprocessInputPacket5 lambdaprocessinputpacket5) {
                clearProcessingRequest clearprocessingrequest2 = clearprocessingrequest;
                getCameraCaptureResult getcameracaptureresult2 = getcameracaptureresult;
                clearprocessingrequest2.b = clearprocessingrequest2.asInterface.getLayoutManager().onSaveInstanceState();
                getcameracaptureresult2.b(lambdaprocessinputpacket5);
            }
        });
        clearProcessingRequest clearprocessingrequest2 = this.f1409a;
        getRotatedSize getrotatedsize = new getRotatedSize() { // from class: copyFileToOutputStream
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            private static char[] b;
            private static final byte[] $$c = {93, -77, 2, Base64.padSymbol};
            private static final int $$d = 66;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {91, -17, 90, 37};
            private static final int $$b = 133;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int g = 1;

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(byte r5, short r6, byte r7, java.lang.Object[] r8) {
                /*
                    int r6 = r6 * 3
                    int r0 = 1 - r6
                    int r7 = r7 + 97
                    byte[] r1 = defpackage.copyFileToOutputStream.$$a
                    int r5 = r5 * 2
                    int r5 = 3 - r5
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r6 = 0 - r6
                    if (r1 != 0) goto L16
                    r4 = r6
                    r3 = r2
                    goto L2a
                L16:
                    r3 = r2
                L17:
                    int r5 = r5 + 1
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    if (r3 != r6) goto L26
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    r8[r2] = r5
                    return
                L26:
                    int r3 = r3 + 1
                    r4 = r1[r5]
                L2a:
                    int r7 = r7 + r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.copyFileToOutputStream.c(byte, short, byte, java.lang.Object[]):void");
            }

            private static void a(int i7, int i8, char c, Object[] objArr) throws Throwable {
                int i9 = 2 % 2;
                lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                long[] jArr = new long[i8];
                int i10 = 0;
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i11 = $11 + 61;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i8) {
                    int i13 = $11 + 3;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i10] = Integer.valueOf(b[i7 + i15]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                            int packedPositionGroup = 2187 - ExpandableListView.getPackedPositionGroup(0L);
                            int iResolveOpacity = 40 - Drawable.resolveOpacity(i10, i10);
                            byte b2 = (byte) i10;
                            String str$$e = $$e(b2, b2, $$c[2]);
                            Class[] clsArr = new Class[1];
                            clsArr[i10] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, packedPositionGroup, iResolveOpacity, 841711447, false, str$$e, clsArr);
                        }
                        try {
                            Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i15), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 33016), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3011, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, 321985076, false, $$e(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i15] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                            try {
                                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b5 = (byte) 0;
                                    byte b6 = b5;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 36505), 3376 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 17, -968507904, false, $$e(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                i10 = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                char[] cArr = new char[i8];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i8) {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 36505), 3376 - TextUtils.getOffsetAfter("", 0), KeyEvent.keyCodeFromString("") + 17, -968507904, false, $$e(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr);
            }

            @Override // defpackage.getRotatedSize
            public final void b(List list) {
                int i7 = 2 % 2;
                submitProcessingRequest submitprocessingrequest = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                ImagePickerConfig imagePickerConfig2 = imagePickerConfig;
                submitprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(submitprocessingrequest.f1409a.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                copyFileToMediaStore copyfiletomediastore = submitprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                clearProcessingRequest clearprocessingrequest3 = submitprocessingrequest.f1409a;
                if (clearprocessingrequest3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    throw new IllegalStateException("Must call setupAdapters first!");
                }
                List<Image> list2 = clearprocessingrequest3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (ProcessingInput2Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imagePickerConfig2, false)) {
                    int i8 = g + 113;
                    TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                    int i9 = i8 % 2;
                    if (list.isEmpty()) {
                        return;
                    }
                    copyTempFileToUri copytempfiletouri = submitprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    clearProcessingRequest clearprocessingrequest4 = submitprocessingrequest.f1409a;
                    if (clearprocessingrequest4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                        throw new IllegalStateException("Must call setupAdapters first!");
                    }
                    copytempfiletouri.TuitionPaymentFragmentspecialinlinedviewModeldefault2(clearprocessingrequest4.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i10 = g + 73;
                    TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                    int i11 = i10 % 2;
                }
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context r64, int r65, int r66, int r67) {
                /*
                    Method dump skipped, instruction units count: 14785
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.copyFileToOutputStream.TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context, int, int, int):java.lang.Object[]");
            }

            static {
                char[] cArr = new char[2154];
                ByteBuffer.wrap("±³\u001bøåùOê\u0019³ãûMó\u0017ðáøKú\u0015õÿïIô\u0013ÃýýGø\u0011øûîEù/ïùïCÃ-ï÷ìAý+ÿõù¶\n\u001cAâ@HS\u001e\näBJJ\u0010IæALC\u0012LøVNM\u0014zúU@L\u0016Uü@Bz(AþUDW*FðQFA\u0086¶,ýÒüxï.¶Ôþzö õÖý|ÿ\"ðÈê~ñ$ÆÊêpà&÷Ìú´¹\u001eåàïJå\u001c¹æûHù\u0012òäãNú\u0010óú¹Lñ\u0016ùøúBò\u0014ðþÿ@å*þüÉFô(÷òâDâ.óðäZï¿\u0087\u0015ÍëÜAË\u0017\u0087íÌCÏ\u0019\u0086ïØEÚ\u001bÇñØ±³\u001bùåèOÿ\u0019³ãïMõ\u0017ñá²Kì\u0015îÿóIì%!\u008f}qjÛm\u008dow|Ùj\u0083!u\\ßH\u0081CkaÝx\u0087kiJÓo\u0085zoo±³\u001bøåýOè\u0019ýã³M²\u0017ÿáìKé\u0015õÿòIú\u0013óBJèW\u0016\u0016¼ZêW\u0010W¾Lä\u0016\u0012J¸]æ\\\fJºWàQ\u000e\\´gâV\b]¶LÜg\n\\°VÞK\u0004\t±î\u001bóå²Oþ\u0019óãóMè\u0017²áîKù\u0015øÿîIó\u0013õýøGÃ\u0011òûùEè/ÃùøCò-ï÷®\u0000¹ªåTïþå¨âRóüû¦¹Púúÿ¤ôN¹øú¢ÿLôöø ôJ¸ôå\u009eù±þ\u001bõåûOò\u0019óãä8=\u0092alkÆa\u0090fjwÄ\u007f\u009e=hpÂ{\u009c|v=À|\u009awt\u007fÎg\u0098Dr_Ì?¦|pwÊ\u007f¤g~?Èq¢}||Öf `z}Ô~±³\u001bïååOï\u0019èãùMñ\u0017³áþKõ\u0015òÿ³Iò\u0013ùýñGé\u0011ÊûÑE±/ìùîCó-ì±³\u001bïååOï\u0019èãùMñ\u0017³áðKõ\u0015þÿ³Ið\u0013õýþGò\u0011ùûñEé/ÊùÑCì-î÷óAì+²õï_ó±³\u001bøåùOê\u0019³ãòMù\u0017ñáéKû\u0015éÿùIï\u0013è\u0087\u0001-\u001cÓ]y\u0011/\u0006Õ\u001a{\u001f!\u0017×]}\u001b#\u001cÉ\u0000\u007f\u0007±ò\u001bùåýOï\u0019ùã²Mò\u0017ùáèsáÙ¾'¼\u008d¡Û\u00ad!á\u008f¨Õ§#¢\u0089«×½=·\u008b½Ñº?«\u0085£Ó½±ò\u001bùåñOé\u0019ïãú±î\u001bóå²Oì\u0019îãóMø\u0017éáÿKè\u0015²ÿñIý\u0013òýéGú\u0011ýûÿEè/éùîCù-î±û\u001bùåòOå±ì\u001bùåîOï\u0019õãïMè\u0017²áïKå\u0015ïÿ²Iþ\u0013øý²Gø\u0011ùûþEé/ûù²Cû-ì÷éA²+úõý_÷)ùóÃ]û'ìñé[Ã%î\u008fùYò#ø\u008dùWî!ù\u008bî±ì\u001bùåîOï\u0019õãïMè\u0017²áïKå\u0015ïÿ²Iþ\u0013øý²Gø\u0011ùûþEé/ûù²Cû-ì÷éA²+úõý_÷)ùóÃ]û'ìñé[Ã%ê\u008fùYò#ø\u008dóWî±ì\u001bùåîOï\u0019õãïMè\u0017²áïKå\u0015ïÿ²Iþ\u0013øý²Gø\u0011ùûþEé/ûù²Cî-ó÷²Aÿ+íõõ±ì\u001bùåîOï\u0019õãïMè\u0017²áïKå\u0015ïÿ²Iþ\u0013øý²Gø\u0011ùûþEé/ûù²Cî-ó÷²Að+ýõÿ¹Y\u0013Lí[GZ\u0011@ëZE]\u001f\u0007éZCP\u001dZ÷\u0007AK\u001bMõ\u0007OM\u0019LóKM\\'Nñ\u0007K[%Fÿ\u0007ID#JýJ±ì\u001bùåîOï\u0019õãïMè\u0017²áïKå\u0015ïÿ²Iþ\u0013øý²Gø\u0011ùûþEé/ûù²Cî-ó÷²Añ+òõÿ±ê\u001bþåóOä\u0019ïãúieÃ:=8\u0097%Á);e\u0095'Ï%9.\u0093?Í&'/\u00919±ê\u001bþåóOä\u0019ûãéMù\u0017ïáè±³\u001bïååOï\u0019èãùMñ\u0017³áúKî\u0015ýÿñIù\u0013ëýóGî\u0011÷û³Eë/õùòCø-ó÷ëAï+±õï_å)ïóè]ù'ññÃ[ï%ù\u008fîYê#ù\u008dîW²!ö\u008býUî±³\u001bêåùOò\u0019øãóMî\u0017³áðKõ\u0015þÿªI¨\u0013³ýôGë\u0011³ûýEé/øùõCó-²÷ìAî+õõñ_ý)îóå]²'ëñõ[ò%ø\u008fóYë#ï\u008d²Wï!ó±³\u001bêåùOò\u0019øãóMî\u0017³áðKõ\u0015þÿªI¨\u0013³ýôGë\u0011³ûôEë/ÿùóCñ-ì÷óAï+ùõî_²)ëóõ]ò'øñó[ë%ï\u008f²Yï#ó±³\u001bïååOï\u0019èãùMñ\u0017³áðKõ\u0015þÿªI¨\u0013³ýÿGð\u0011óûéEø/ÃùýCõ-ø÷ðAÃ+õõò_è)ùóî]ú'ýñÿ[ù%±\u008fÿYì#ì\u008d²Wï!ó±³\u001bùåèOÿ\u0019³ãõMò\u0017õáèK³\u0015õÿòIõ\u0013èý²Gÿ\u0011ðûóEé/øùïCù-î÷êAõ+ÿõù_²)îóÿ¨\u001a\u00028ü3V$\u00000ú2T)\u000e4ø2R3±é\u001bòå÷Oò\u0019óãëMò±ÿ\u001bôåîOó\u0019ñãõMé\u0017ñ±î\u001bóå²Oì\u0019îãóMø\u0017éáÿKè\u0015²ÿøIù\u0013êýõGÿ\u0011ù6Y\u009cMb@ÈW\u009e\u0017d\u0019Ê_ü%V'¨,\u0002'T0®+\u0000!±û\u001bùåòOù\u0019îãõMÿ\u0017ÃáäK¤\u0015ª©î\u0003ìýçWì\u0001ûûàUê\u000fÖùñS±\r¿çÖQ¿\u000b½±î\u001bóå²Oì\u0019îãóMø\u0017éáÿKè\u0015²ÿñIó\u0013øýùGð±ï\u001bøå÷\u009dV7^ÉFc_5RÏGa\\;A±Ý\u001bìåìO¼\u0019ÎãéMò\u0017èáõKñ\u0015ùÿ¼Iú\u0013óýîG¼\u0011ßûôEî/óùñCù±Ý\u001bòåøOî\u0019óãõMø\u0017¼áÏKØ\u0015×ÿ¼Iþ\u0013éýõGð\u0011èû¼Eú/óùîC¼-ä÷¤Aª'k\u008dDsNÙX\u008fEuCÛN\u0081\nwyÝn\u0083ai\nßH\u0085_kCÑF\u0087^m\nÓL¹EoXÕ\n»Ra\u0012×\u001c½uc\u001cÉ\u001e±î\u001bóå²Oô\u0019ýãîMø\u0017ëáýKî\u0015ù±û\u001bóåðOø\u0019úãõMï\u0017ô±ê\u001bþåóOä\u0019¤ãª±î\u001býåòOÿ\u0019ôãéX÷òê\f«¦õð÷\nê¤áþð\bæ¢ñü«\u0016ç ÷úä\u0014ë®á±î\u001bóå²O÷\u0019ùãîMò\u0017ùáðK²\u0015íÿùIñ\u0013é\u008fq±î\u001bóå²Oï\u0019ùãÿMé\u0017îáù±¬v}Ü`\"!\u0088mÞz$f\u008acÐk&!\u008c\u007fÒ}8`\u008ekÔz:l\u0080{±ú\u001béåðOð\u0019ÃãäM¤\u0017ª\u0094½> Àáj\u00ad<ºÆ¦h£2«Äán©0¦Ú¡l¨6ªØ½b¿4½Þ¦`¡\n»D\fî\u000e\u0010\u0005º\u000eì\u0019\u0016\u0002¸\bâD\u0014\u0018¾\u000fà\u0000\nD¼\fæ\u000e\b\u0005²\u000eä\u0019\u000e\u0002°\b±û\u001bùåòOù\u0019îãõMÿ\u0017ÃáäK¤\u0015ªÿ³Iï\u0013øý÷GÃ\u0011äû¤Eª/³ùûCù-ò÷ùAî+õõÿ_Ã)äó¤]ª±û\u001bùåòOù\u0019îãõMÿ\u0017³áûKó\u0015óÿûIð\u0013ùýÃGï\u0011øû÷E³/ûùùCò-ù÷îAõ+ÿ±û\u001bùåòOù\u0019îãõMÿ\u0017³áêKþ\u0015óÿäI¤\u0013ªýìG³\u0011êûþEó/äù¤Cª-ì±û\u001bóåóOû\u0019ðãùM³\u0017ïáøK÷\u0015ÃÿûIì\u0013ôýóGò\u0011ùûÃEä/¤ùªC³-û÷ùAò+ùõî_õ)ÿóÃ]ä'¤ñª±î\u001bóå²Oþ\u0019óãóMè\u0017ðáóKý\u0015øÿùIî±î\u001bóå²Oþ\u0019óãóMè\u0017õáñKý\u0015ûÿùI²\u0013þýéGõ\u0011ðûøE²/úùõCò-û÷ùAî+ìõî_õ)òóè±Ý\u001bòåøOî\u0019óãõMø\u0017±áäK¤\u0015ª±î\u001bóå²Oþ\u0019éãõMð\u0017øá²Kø\u0015õÿïIì\u0013ðýýGå\u0011²ûõEø±è\u001bùåïOè\u0019±Ù;s<\u008d;'&q|\u008b!%$\u007f1\u0089|##}7\u0097?!'{\u007f\u0095\"/ y=\u0093\"-!\u0094\u0082>\u0096À\u009ej\u0086<ÝÆ\u009bh\u00842ÝÄ\u009en\u00920\u009aÚ\u009dl\u00986\u0096Ø\u008ab\u0080±í\u001bùåñOé\u0019²ãïMú\u0017²áúKý\u0015÷ÿùIÃ\u0013ÿýýGñ\u0011ùûîEý±í\u001bùåñOé\u0019²ãïMú\u0017²áðKÿ\u0015øÿÃIø\u0013ùýòGï\u0011õûèEå±î\u001bóå²O÷\u0019ùãîMò\u0017ùáðK²\u0015ýÿòIø\u0013îýóGõ\u0011øû²Eí/ùùñCé-ø±î\u001bóå²Oþ\u0019óãóMè\u0017²áíKù\u0015ñÿéI²\u0013ýýêGø\u0011ÃûòEý/ñùù±î\u001bóå²Oó\u0019øãñM²\u0017þáéKõ\u0015ðÿøI²\u0013úýõGò\u0011ûûùEî/ìùîCõ-ò÷è±î\u001bóå²Oì\u0019îãóMø\u0017éáÿKè\u0015²ÿþIé\u0013õýðGø\u0011²ûúEõ/òùûCù-î÷ìAî+õõò_è±î\u001bóå²Oï\u0019åãïMè\u0017ùáñK²\u0015þÿéIõ\u0013ðýøG²\u0011úûõEò/ûùùCî-ì÷îAõ+òõè±î\u001bóå²Oï\u0019åãïMè\u0017ùáñKÃ\u0015ùÿäIè\u0013²ýþGé\u0011õûðEø/²ùúCõ-ò÷ûAù+îõì_î)õóò]èY\u0016ó\u000b\rJ§\u0012ñ\u0001\u000b\n¥\u0000ÿ\u000b\t\u0016£Jý\u0006\u0017\u0011¡\rû\b\u0015\u0000¯Jù\u0002\u0013\r\u00ad\nÇ\u0003\u0011\u0001«\u0016Å\u0014\u001f\u0016©\rÃ\n\u001d\u0010-3\u0087.yoÓ7\u0085$\u007f/Ñ%\u008b.}3×\u001e\u0089%c-Õ*\u008f,aoÛ#\u008d4g(Ù-³%eoß'±(k/Ý&·$i3Ã1µ3o(Á/»5±´±°\u001b¼±¦3\u0019±³\u001bøåùOê\u0019³ãíMù\u0017ñáéKÃ\u0015ìÿõIì\u0013ùå\u000bO@±A\u001bRM\u000b·W\u0019KCGµO\u001fAAP«\u000b\u001dFGE©W\u0013AEF¯E\u0011J{@\u00ad{\u0017CyA£J\u0015]\u007f@±³\u001bøåùOê\u0019³ãïMó\u0017ÿá÷Kù\u0015èÿ³Iû\u0013ùýòGå\u0011ø¢~\b5ö4\\'\n~ð\"^>\u00042ò:X4\u0006%ì~Z \u00004î<T$\u00025¡+\u000bwõ}_w\t+óu]a\u0007iñq[[\u0005pïvYe\u0003gíaØ'r{\u008cq&{p|\u008am$e~'\u0088d\"a|j\u0096' dza\u0094j.kxW\u0092e,iFd\u0090d*gDk\u009eW(lBm\u009cj6}@o\u009aW4yNm\u0098e2}L&æ{0gÎ0d{\u009az0if0\u009c}2lhk\u009e@4xjo\u0080l±³\u001bøåùOê\u0019³ãþMï\u0017èáÃKè\u0015õÿñIù±³\u001bøåùOê\u0019³ãïMó\u0017ÿá÷Kù\u0015èÿ³Iþ\u0013ïýèGú\u0011óûðEø/ùùîCø\u009bp1,Ï&e,3+É:g2=pË3a6?=Õpc396×=m=;,Ñ+o9\u00050Ó3i;\u0007:Ý-k\u0000\u00015ß1u6\u0003qÙ,w0±³\u001bøåùOê\u0019³ãþMï\u0017èáýKÿ\u0015ÿÿù\u007fÙÕ\u0092+\u0093\u0081\u0080×Ù-\u0094\u0083\u0085Ù\u0082/\u0091\u0085\u008fÛ\u00841\u0099$ÿ\u008e´pµÚ¦\u008cÿv²Ø£\u0082¤t½Þµ\u0080·j¾\u0095.?eÁdkw=.Çcir3uÅnos1hÛd7q\u009d:c;É(\u009fqe<Ë-\u0091*g(Í3\u0093-y9±³\u001bøåùOê\u0019³ãþMï\u0017èáìKû\u0015ýÿõIì\u0013ÿ±³\u001bøåùOê\u0019³ãþMï\u0017èáÃKõ\u0015ñÿùþ\u001fTTªQ\u0000DVQ¬\u001f\u0002TX_®G\u0004^Z\\°_\u0006Q\\T²C\b\u001f^\u001e´H\nR`\u001f¶R\fCbD¸[±³\u001bñåòOè\u0019³ãëMõ\u0017òáøKó\u0015ëÿïI³\u0013ÞýïGè\u0011ÏûôEý/îùùCø-Ú÷óAð+øõù_îQ¯ûð\u0005ò¯ïùã\u0003¯\u00adé÷ï\u0001ð«ïõò\u001fô©ó\u0098D2\u0012Ì\u0012fT0N±³\u001bìåîOó\u0019ÿã³Mï\u0017ùáðKú\u0015³ÿñIý\u0013ìýï=G\u0097RiAÃL\u0095LoOÁC\u009b\u000emGÇO\u0099LsDÅF\u009fIqSËH\u009d\u000ewSÉOH@âE\u001cN¶kà`\u001ai´\u007fîs\u0018N²_ìX\u0006\u0002°_êC Ä\u008a\u008et\u009fÞ\u0088\u0088Är\u0086Ü\u008e\u0086\u008fp\u0082Ú\u008a\u0084´n\u0088Ø\u0084\u0082\u008fl\u008eÖ\u0088\u0080\u0098jÅÔ\u0093¾\u0086h\u0087\u0082\u0092(\u009cÖ\u0085|\u0095*\u0083Ð\u0084~\u0091$\u0093Ò\u009bx\u0083_*õ`\u000bq¡f÷*\rh£jùp\u000fk¥qûvrHØ\u0003&\u0006\u008c\u0013Ú\u0006 H\u008e\u0003Ô\b\"\u0010\u0088\tÖ\u000b<\b\u008a\u0006Ð\u0003>\u0014\u0084HÒI8\u0003\u0086\u0017ìH:\u0006\u0080\u0017î\u00174\u0014\u0082Iè\u001f6\n\u009c\u000bI2ãm\u001do·rá~\u001b2µ~ïm\u0019h³tís\u0007{±r\"2\u0088\u001av\u0019Ü\u0011\u008a\u0013p\u001cÞ\u0006\u0084\u001d±³\u001bøåýOè\u0019ýã³Mñ\u0017õáïKÿ\u0015³ÿìIî\u0013óýúGõ\u0011ðûùEï/³ùÿCé-î÷³A¬+³õÿ_ó)ñó²]ñ'õñÿ[î%ó\u008fêYõ#î\u008dèW²!ñ\u008bùUñ?é\u0089õSñ=ù".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
                b = cArr;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 3354972473356721052L;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(byte r6, short r7, short r8) {
                /*
                    int r8 = r8 * 3
                    int r8 = 115 - r8
                    int r6 = r6 * 3
                    int r6 = r6 + 4
                    int r7 = r7 * 3
                    int r0 = r7 + 1
                    byte[] r1 = defpackage.copyFileToOutputStream.$$c
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L17
                    r3 = r8
                    r4 = r2
                    r8 = r6
                    goto L2c
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    if (r3 != r7) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L23:
                    r4 = r1[r6]
                    int r3 = r3 + 1
                    r5 = r8
                    r8 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L2c:
                    int r6 = r6 + r3
                    int r8 = r8 + 1
                    r3 = r4
                    r5 = r8
                    r8 = r6
                    r6 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.copyFileToOutputStream.$$e(byte, short, short):java.lang.String");
            }
        };
        if (clearprocessingrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            throw new IllegalStateException("Must call setupAdapters first!");
        }
        clearprocessingrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b = getrotatedsize;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        int i = 2 % 2;
        super.onResume();
        if (!this.b) {
            int i2 = RemoteActionCompatParcelizer + 47;
            INotificationSideChannelStubProxy = i2 % 128;
            int i3 = i2 % 2;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        int i4 = RemoteActionCompatParcelizer + 65;
        INotificationSideChannelStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r2
  0x0027: PHI (r2v5 copyTempFileToUri) = (r2v4 copyTempFileToUri), (r2v10 copyTempFileToUri) binds: [B:8:0x0025, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        copyTempFileToUri copytempfiletouri;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 37;
        INotificationSideChannelStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            super.onSaveInstanceState(bundle);
            copytempfiletouri = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = 93 / 0;
            if (copytempfiletouri.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                copytempfiletouri.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new DefaultCameraModule();
            }
        } else {
            super.onSaveInstanceState(bundle);
            copytempfiletouri = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (copytempfiletouri.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                copytempfiletouri.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new DefaultCameraModule();
            }
        }
        bundle.putSerializable("Key.CameraModule", copytempfiletouri.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        if (!this.b) {
            int i4 = INotificationSideChannelStubProxy + 11;
            RemoteActionCompatParcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                bundle.putParcelable("Key.Recycler", this.f1409a.g.onSaveInstanceState());
                ImagePipeline imagePipeline = this.f1409a.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            bundle.putParcelable("Key.Recycler", this.f1409a.g.onSaveInstanceState());
            clearProcessingRequest clearprocessingrequest = this.f1409a;
            if (clearprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                throw new IllegalStateException("Must call setupAdapters first!");
            }
            bundle.putParcelableArrayList("Key.SelectedImages", (ArrayList) clearprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<Image> list) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 11;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        clearProcessingRequest clearprocessingrequest = this.f1409a;
        ImagePipeline imagePipeline = clearprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        imagePipeline.TuitionPaymentFragmentbindingInflater1.clear();
        imagePipeline.TuitionPaymentFragmentbindingInflater1.addAll(list);
        clearprocessingrequest.TuitionPaymentFragmentbindingInflater1(clearprocessingrequest.d);
        clearprocessingrequest.asInterface.setAdapter(clearprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.f1409a.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i4 = RemoteActionCompatParcelizer + 71;
        INotificationSideChannelStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        INotificationSideChannelStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            super.onConfigurationChanged(configuration);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.onConfigurationChanged(configuration);
        clearProcessingRequest clearprocessingrequest = this.f1409a;
        if (clearprocessingrequest != null) {
            clearprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2(configuration.orientation);
            int i3 = RemoteActionCompatParcelizer + 109;
            INotificationSideChannelStubProxy = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        if (ActivityCompat.checkSelfPermission(getActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            int i2 = INotificationSideChannelStubProxy + 35;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            d();
            return;
        }
        String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
        if (!(!ActivityCompat.shouldShowRequestPermissionRationale(getActivity(), "android.permission.WRITE_EXTERNAL_STORAGE"))) {
            int i4 = INotificationSideChannelStubProxy + 119;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            requestPermissions(strArr, 23);
            return;
        }
        if (PreferenceManager.getDefaultSharedPreferences(this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getBoolean("writeExternalRequested", false)) {
            this.cancelAll.b(R.string.ef_msg_no_write_external_permission, new View.OnClickListener() { // from class: JpegBytes2CroppedBitmap
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    submitProcessingRequest.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
                }
            });
            return;
        }
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1).edit();
        editorEdit.putBoolean("writeExternalRequested", true);
        editorEdit.apply();
        requestPermissions(strArr, 23);
    }

    private void d() {
        int i = 2 % 2;
        JpegBytes2Image jpegBytes2Image = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
        ExecutorService executorService = jpegBytes2Image.TuitionPaymentFragmentbindingInflater1;
        if (executorService != null) {
            executorService.shutdown();
            jpegBytes2Image.TuitionPaymentFragmentbindingInflater1 = null;
            int i2 = RemoteActionCompatParcelizer + 23;
            INotificationSideChannelStubProxy = i2 % 128;
            int i3 = i2 % 2;
        }
        ImagePickerConfig imagePickerConfigB = b();
        if (imagePickerConfigB != null) {
            int i4 = INotificationSideChannelStubProxy + 5;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imagePickerConfigB);
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        final submitProcessingRequest submitprocessingrequest = (submitProcessingRequest) objArr[0];
        int i = 2 % 2;
        getUpdatedTransform getupdatedtransform = submitprocessingrequest.g;
        ArrayList arrayList = new ArrayList(2);
        if (ActivityCompat.checkSelfPermission(submitprocessingrequest.getActivity(), "android.permission.CAMERA") != 0) {
            int i2 = RemoteActionCompatParcelizer + 97;
            INotificationSideChannelStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                arrayList.add("android.permission.CAMERA");
                int i3 = 94 / 0;
            } else {
                arrayList.add("android.permission.CAMERA");
            }
        }
        if (ActivityCompat.checkSelfPermission(submitprocessingrequest.getActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(submitprocessingrequest.getActivity(), (String) arrayList.get(i4))) {
                int i5 = INotificationSideChannelStubProxy + 29;
                RemoteActionCompatParcelizer = i5 % 128;
                int i6 = i5 % 2;
                submitprocessingrequest.requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 24);
                return null;
            }
            i4++;
            int i7 = INotificationSideChannelStubProxy + 109;
            RemoteActionCompatParcelizer = i7 % 128;
            int i8 = i7 % 2;
        }
        if (!PreferenceManager.getDefaultSharedPreferences(submitprocessingrequest.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getBoolean("cameraRequested", false)) {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(submitprocessingrequest.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1).edit();
            editorEdit.putBoolean("cameraRequested", true);
            editorEdit.apply();
            submitprocessingrequest.requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 24);
            return null;
        }
        if (!submitprocessingrequest.b) {
            submitprocessingrequest.cancelAll.b(R.string.ef_msg_no_camera_permission, new View.OnClickListener() { // from class: notifyCaptureError
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    Object[] objArr2 = {this.TuitionPaymentFragmentbindingInflater1, view};
                    submitProcessingRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(847962909, -847962908, RecurringPlanResponse.b(), RecurringPlanResponse.b(), RecurringPlanResponse.b(), objArr2, RecurringPlanResponse.b());
                }
            });
            return null;
        }
        Toast.makeText(submitprocessingrequest.getActivity().getApplicationContext(), submitprocessingrequest.getString(R.string.ef_msg_no_camera_permission), 0).show();
        submitprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer;
        int i4 = i3 + 21;
        int i5 = i4 % 128;
        INotificationSideChannelStubProxy = i5;
        int i6 = i4 % 2;
        Object objValueOf = "(empty)";
        if (i == 23) {
            if (iArr.length != 0) {
                int i7 = i3 + 13;
                int i8 = i7 % 128;
                INotificationSideChannelStubProxy = i8;
                if (i7 % 2 == 0 ? iArr[0] == 0 : iArr[1] == 0) {
                    int i9 = i8 + 115;
                    RemoteActionCompatParcelizer = i9 % 128;
                    if (i9 % 2 != 0) {
                        d();
                        return;
                    } else {
                        d();
                        throw null;
                    }
                }
            }
            int length = iArr.length;
            Objects.toString(iArr.length > 0 ? Integer.valueOf(iArr[0]) : "(empty)");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            return;
        }
        int i10 = i5 + 53;
        int i11 = i10 % 128;
        RemoteActionCompatParcelizer = i11;
        int i12 = i10 % 2;
        if (i != 24) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            return;
        }
        if (iArr.length != 0 && iArr[0] == 0) {
            int i13 = i11 + 53;
            INotificationSideChannelStubProxy = i13 % 128;
            int i14 = i13 % 2;
            asInterface();
            return;
        }
        int length2 = iArr.length;
        if (iArr.length > 0) {
            int i15 = RemoteActionCompatParcelizer + 125;
            INotificationSideChannelStubProxy = i15 % 128;
            objValueOf = i15 % 2 != 0 ? Integer.valueOf(iArr[1]) : Integer.valueOf(iArr[0]);
        }
        Objects.toString(objValueOf);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        if (i == 2000) {
            int i4 = INotificationSideChannelStubProxy + 81;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            if (i2 != -1) {
                if (i2 == 0 && this.b) {
                    copyTempFileToUri copytempfiletouri = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (copytempfiletouri.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        copytempfiletouri.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new DefaultCameraModule();
                    }
                    DefaultCameraModule defaultCameraModule = copytempfiletouri.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (defaultCameraModule.currentImagePath != null) {
                        File file = new File(defaultCameraModule.currentImagePath);
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    return;
                }
                return;
            }
            final copyTempFileToUri copytempfiletouri2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            final FragmentActivity activity = getActivity();
            final BaseConfig baseConfigB = this.b ? (CameraOnlyConfig) getArguments().getParcelable("CameraOnlyConfig") : b();
            if (copytempfiletouri2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                copytempfiletouri2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new DefaultCameraModule();
            }
            final DefaultCameraModule defaultCameraModule2 = copytempfiletouri2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            final setContentValuePendingFlag setcontentvaluependingflag = new setContentValuePendingFlag() { // from class: isSaveToMediaStore
                @Override // defpackage.setContentValuePendingFlag
                public final void TuitionPaymentFragmentbindingInflater1(List list) {
                    copyTempFileToUri copytempfiletouri3 = copytempfiletouri2;
                    if (ProcessingInput2Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(baseConfigB, true)) {
                        ((JpegBytes2DiskIn) copytempfiletouri3.TuitionPaymentFragmentbindingInflater1).TuitionPaymentFragmentbindingInflater1(list);
                    } else {
                        ((JpegBytes2DiskIn) copytempfiletouri3.TuitionPaymentFragmentbindingInflater1).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    }
                }
            };
            String str = defaultCameraModule2.currentImagePath;
            if (str != null) {
                final Uri uri = Uri.parse(str);
                if (uri != null) {
                    MediaScannerConnection.scanFile(activity.getApplicationContext(), new String[]{uri.getPath()}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: updateUriPendingStatus
                        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                        public final void onScanCompleted(String str2, Uri uri2) {
                            DefaultCameraModule defaultCameraModule3 = defaultCameraModule2;
                            setContentValuePendingFlag setcontentvaluependingflag2 = setcontentvaluependingflag;
                            Context context = activity;
                            Uri uri3 = uri;
                            if (getUpdatedTransform.b == null) {
                                getUpdatedTransform.b = new getUpdatedTransform();
                            }
                            Objects.toString(uri2);
                            if (str2 == null) {
                                if (getUpdatedTransform.b == null) {
                                    getUpdatedTransform.b = new getUpdatedTransform();
                                }
                                str2 = defaultCameraModule3.currentImagePath;
                            }
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new Image(0L, str2.contains(File.separator) ? str2.substring(str2.lastIndexOf(File.separator) + 1) : str2, str2));
                            setcontentvaluependingflag2.TuitionPaymentFragmentbindingInflater1(arrayList);
                            context.revokeUriPermission(uri3, 3);
                        }
                    });
                    return;
                }
                return;
            }
            int i6 = INotificationSideChannelStubProxy + 31;
            RemoteActionCompatParcelizer = i6 % 128;
            if (i6 % 2 == 0) {
                getUpdatedTransform getupdatedtransform = getUpdatedTransform.b;
                throw null;
            }
            if (getUpdatedTransform.b == null) {
                getUpdatedTransform.b = new getUpdatedTransform();
                int i7 = RemoteActionCompatParcelizer + 101;
                INotificationSideChannelStubProxy = i7 % 128;
                int i8 = i7 % 2;
            }
            setcontentvaluependingflag.TuitionPaymentFragmentbindingInflater1(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    public final void TuitionPaymentFragmentbindingInflater1() throws Throwable {
        boolean z;
        boolean z2;
        int i = 2 % 2;
        if (ActivityCompat.checkSelfPermission(getActivity(), "android.permission.CAMERA") == 0) {
            int i2 = RemoteActionCompatParcelizer + 115;
            INotificationSideChannelStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                z = true;
            }
            if (ActivityCompat.checkSelfPermission(getActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                int i3 = RemoteActionCompatParcelizer + 115;
                INotificationSideChannelStubProxy = i3 % 128;
                z2 = i3 % 2 != 0;
            }
            if (z || !z2) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(-948741934, 948741934, RecurringPlanResponse.b(), RecurringPlanResponse.b(), RecurringPlanResponse.b(), new Object[]{this}, RecurringPlanResponse.b());
            } else {
                int i4 = INotificationSideChannelStubProxy + 59;
                RemoteActionCompatParcelizer = i4 % 128;
                int i5 = i4 % 2;
                asInterface();
                return;
            }
        }
        int i6 = RemoteActionCompatParcelizer + 23;
        INotificationSideChannelStubProxy = i6 % 128;
        int i7 = i6 % 2;
        z = false;
        if (ActivityCompat.checkSelfPermission(getActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            int i8 = RemoteActionCompatParcelizer + 115;
            INotificationSideChannelStubProxy = i8 % 128;
            if (i8 % 2 != 0) {
            }
        }
        if (z) {
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(-948741934, 948741934, RecurringPlanResponse.b(), RecurringPlanResponse.b(), RecurringPlanResponse.b(), new Object[]{this}, RecurringPlanResponse.b());
    }

    private void asInterface() {
        boolean z;
        File file;
        int i = 2 % 2;
        FragmentActivity activity = getActivity();
        int i2 = 0;
        if (new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(activity.getPackageManager()) != null) {
            z = true;
        } else {
            int i3 = RemoteActionCompatParcelizer + 33;
            INotificationSideChannelStubProxy = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (!z) {
            Context applicationContext = activity.getApplicationContext();
            Toast.makeText(applicationContext, applicationContext.getString(R.string.ef_error_no_camera), 1).show();
        }
        if (!z) {
            int i5 = INotificationSideChannelStubProxy + 41;
            RemoteActionCompatParcelizer = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 62 / 0;
                return;
            }
            return;
        }
        copyTempFileToUri copytempfiletouri = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        BaseConfig baseConfigB = this.b ? (CameraOnlyConfig) getArguments().getParcelable("CameraOnlyConfig") : b();
        Context applicationContext2 = getActivity().getApplicationContext();
        if (copytempfiletouri.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            copytempfiletouri.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new DefaultCameraModule();
        }
        DefaultCameraModule defaultCameraModule = copytempfiletouri.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        FragmentActivity activity2 = getActivity();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        ImagePickerSavePath imagePickerSavePath = baseConfigB.INotificationSideChannelStub;
        String str = imagePickerSavePath.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        File file2 = imagePickerSavePath.b ? new File(str) : new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), str);
        Object obj = null;
        if (file2.exists() || file2.mkdirs()) {
            String str2 = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.getDefault()).format(new Date());
            StringBuilder sb = new StringBuilder("IMG_");
            sb.append(str2);
            sb.append(".jpg");
            file = new File(file2, sb.toString());
            while (file.exists()) {
                i2++;
                StringBuilder sb2 = new StringBuilder("IMG_");
                sb2.append(str2);
                sb2.append("(");
                sb2.append(i2);
                sb2.append(").jpg");
                file = new File(file2, sb2.toString());
            }
        } else {
            int i7 = INotificationSideChannelStubProxy + 17;
            RemoteActionCompatParcelizer = i7 % 128;
            if (i7 % 2 == 0) {
                getUpdatedTransform getupdatedtransform = getUpdatedTransform.b;
                obj.hashCode();
                throw null;
            }
            if (getUpdatedTransform.b == null) {
                getUpdatedTransform.b = new getUpdatedTransform();
            }
            file = null;
        }
        if (file != null) {
            Context applicationContext3 = activity2.getApplicationContext();
            Uri uriForFile = FileProvider.getUriForFile(applicationContext3, String.format(Locale.ENGLISH, "%s%s", applicationContext3.getPackageName(), ".imagepicker.provider"), file);
            StringBuilder sb3 = new StringBuilder("file:");
            sb3.append(file.getAbsolutePath());
            defaultCameraModule.currentImagePath = sb3.toString();
            intent.putExtra("output", uriForFile);
            Iterator<ResolveInfo> it = activity2.getPackageManager().queryIntentActivities(intent, 65536).iterator();
            while (it.hasNext()) {
                activity2.grantUriPermission(((PackageItemInfo) it.next().activityInfo).packageName, uriForFile, 3);
            }
        } else {
            intent = null;
        }
        if (intent == null) {
            Toast.makeText(applicationContext2, applicationContext2.getString(R.string.ef_error_create_image_file), 1).show();
        } else {
            startActivityForResult(intent, 2000);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 97;
        INotificationSideChannelStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            throw null;
        }
        super.onDestroy();
        copyTempFileToUri copytempfiletouri = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (copytempfiletouri != null) {
            JpegBytes2Image jpegBytes2Image = copytempfiletouri.b;
            ExecutorService executorService = jpegBytes2Image.TuitionPaymentFragmentbindingInflater1;
            if (executorService != null) {
                executorService.shutdown();
                jpegBytes2Image.TuitionPaymentFragmentbindingInflater1 = null;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1 = null;
        }
        if (this.notify != null) {
            getActivity().getContentResolver().unregisterContentObserver(this.notify);
            this.notify = null;
        }
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.d = null;
        }
        int i3 = RemoteActionCompatParcelizer + 9;
        INotificationSideChannelStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 64 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 69;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(context);
        if (!(context instanceof copyFileToMediaStore)) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (copyFileToMediaStore) context;
        int i4 = INotificationSideChannelStubProxy + 51;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 % 3;
        }
    }

    @Override // defpackage.JpegBytes2DiskIn
    public final void TuitionPaymentFragmentbindingInflater1(List<Image> list) {
        int i = 2 % 2;
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("selectedImages", (ArrayList) list);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(intent);
        int i2 = INotificationSideChannelStubProxy + 93;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // defpackage.JpegBytes2DiskIn
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i4 = RemoteActionCompatParcelizer + 115;
        INotificationSideChannelStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r1.b != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r4.f1409a.b(r6);
        r4.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r4.f1409a.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r1.b != false) goto L11;
     */
    @Override // defpackage.JpegBytes2DiskIn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.List<com.esafirm.imagepicker.model.Image> r5, java.util.List<defpackage.lambdaprocessInputPacket5> r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            com.esafirm.imagepicker.features.ImagePickerConfig r1 = r4.b()
            if (r1 == 0) goto L32
            int r2 = defpackage.submitProcessingRequest.RemoteActionCompatParcelizer
            int r2 = r2 + 39
            int r3 = r2 % 128
            defpackage.submitProcessingRequest.INotificationSideChannelStubProxy = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L1d
            boolean r1 = r1.b
            r2 = 34
            int r2 = r2 / 0
            if (r1 == 0) goto L32
            goto L21
        L1d:
            boolean r1 = r1.b
            if (r1 == 0) goto L32
        L21:
            clearProcessingRequest r5 = r4.f1409a
            r5.b(r6)
            copyFileToMediaStore r5 = r4.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            clearProcessingRequest r6 = r4.f1409a
            java.lang.String r6 = r6.TuitionPaymentFragmentspecialinlinedviewModeldefault3()
            r5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r6)
            return
        L32:
            r4.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r5)
            int r5 = defpackage.submitProcessingRequest.INotificationSideChannelStubProxy
            int r5 = r5 + 89
            int r6 = r5 % 128
            defpackage.submitProcessingRequest.RemoteActionCompatParcelizer = r6
            int r5 = r5 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.submitProcessingRequest.b(java.util.List, java.util.List):void");
    }

    @Override // defpackage.JpegBytes2DiskIn
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        String str;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 3;
        INotificationSideChannelStubProxy = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (th == null || !(th instanceof NullPointerException)) {
            str = "Unknown Error";
        } else {
            int i4 = i2 + 55;
            INotificationSideChannelStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str = "Images do not exist";
        }
        Toast.makeText(getActivity(), str, 0).show();
    }

    @Override // defpackage.JpegBytes2DiskIn
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z) {
        int i;
        int i2 = 2 % 2;
        ProgressBar progressBar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = 0;
        if (z) {
            int i4 = INotificationSideChannelStubProxy + 69;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
        RecyclerView recyclerView = this.asBinder;
        if (z) {
            int i6 = RemoteActionCompatParcelizer + 87;
            INotificationSideChannelStubProxy = i6 % 128;
            int i7 = i6 % 2;
            i3 = 8;
        }
        recyclerView.setVisibility(i3);
        this.TuitionPaymentFragmentbindingInflater1.setVisibility(8);
    }

    @Override // defpackage.JpegBytes2DiskIn
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 65;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setVisibility(8);
        this.asBinder.setVisibility(8);
        this.TuitionPaymentFragmentbindingInflater1.setVisibility(0);
        int i4 = RemoteActionCompatParcelizer + 85;
        INotificationSideChannelStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(submitProcessingRequest submitprocessingrequest, View view) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            int iB = RecurringPlanResponse.b();
            int iB2 = RecurringPlanResponse.b();
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(1236469634, -1236469632, iB, RecurringPlanResponse.b(), RecurringPlanResponse.b(), new Object[]{submitprocessingrequest}, iB2);
            ViewPortBuilder.b();
            int i4 = INotificationSideChannelStubProxy + 103;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        submitProcessingRequest submitprocessingrequest = (submitProcessingRequest) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 83;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                int iB = RecurringPlanResponse.b();
                int iB2 = RecurringPlanResponse.b();
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(1236469634, -1236469632, iB, RecurringPlanResponse.b(), RecurringPlanResponse.b(), new Object[]{submitprocessingrequest}, iB2);
                ViewPortBuilder.b();
                throw null;
            }
            int iB3 = RecurringPlanResponse.b();
            int iB4 = RecurringPlanResponse.b();
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(1236469634, -1236469632, iB3, RecurringPlanResponse.b(), RecurringPlanResponse.b(), new Object[]{submitprocessingrequest}, iB4);
            ViewPortBuilder.b();
            int i4 = RemoteActionCompatParcelizer + 125;
            INotificationSideChannelStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 40 / 0;
            }
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(submitProcessingRequest submitprocessingrequest, View view) throws Throwable {
        int iB = RecurringPlanResponse.b();
        int iB2 = RecurringPlanResponse.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(847962909, -847962908, iB, RecurringPlanResponse.b(), RecurringPlanResponse.b(), new Object[]{submitprocessingrequest, view}, iB2);
    }

    private void a() throws Throwable {
        int iB = RecurringPlanResponse.b();
        int iB2 = RecurringPlanResponse.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(1236469634, -1236469632, iB, RecurringPlanResponse.b(), RecurringPlanResponse.b(), new Object[]{this}, iB2);
    }

    private void asBinder() throws Throwable {
        int iB = RecurringPlanResponse.b();
        int iB2 = RecurringPlanResponse.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(-948741934, 948741934, iB, RecurringPlanResponse.b(), RecurringPlanResponse.b(), new Object[]{this}, iB2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r5, int r6, short r7) {
        /*
            int r6 = r6 + 4
            byte[] r0 = defpackage.submitProcessingRequest.$$c
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r5 = 104 - r5
            byte[] r1 = new byte[r1]
            r2 = -1
            if (r0 != 0) goto L12
            r5 = r6
            r3 = r7
            goto L27
        L12:
            r4 = r6
            r6 = r5
            r5 = r4
        L15:
            int r2 = r2 + 1
            int r5 = r5 + 1
            byte r3 = (byte) r6
            r1[r2] = r3
            if (r2 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L25:
            r3 = r0[r5]
        L27:
            int r3 = -r3
            int r6 = r6 + r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.submitProcessingRequest.$$e(short, int, short):java.lang.String");
    }
}
