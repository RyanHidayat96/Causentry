package com.bpjstku.presentation.membership.registration.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
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
import android.widget.Toast;
import com.bpjstku.util.constant.Citizenship;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.constant.RegistrationStatus;
import defpackage.SessionProcessor;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010\u0003\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020 HÖ\u0001¢\u0006\u0004\b'\u0010\"J\u0010\u0010(\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020*2\u0006\u0010\u0004\u001a\u00020 ¢\u0006\u0004\b,\u0010-R\u0016\u00100\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00105\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u00101\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010/R\u0016\u0010<\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010/R\u0016\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010/R\u0016\u0010?\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010/R\u0016\u0010A\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010/R\u0016\u0010C\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010/R\u0016\u0010E\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010/R\u0016\u0010=\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0016\u0010@\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010/R\u0016\u0010;\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010/R\u0016\u0010G\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010/R\u0016\u0010D\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010HR\u0016\u0010B\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010HR\u0016\u0010>\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010HR\u001c\u00108\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010H\u001a\u0004\b2\u0010JR\u0016\u0010I\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010/R\u0016\u00103\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010/R\u0016\u0010K\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010/"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Landroid/os/Parcelable;", "", "p0", "p1", "Lcom/bpjstku/util/constant/RegistrationStatus;", "p2", "Lcom/bpjstku/util/constant/Citizenship;", "p3", "Lcom/bpjstku/util/constant/MembershipType;", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "Ljava/io/File;", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/util/constant/RegistrationStatus;Lcom/bpjstku/util/constant/Citizenship;Lcom/bpjstku/util/constant/MembershipType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "asInterface", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "TuitionPaymentFragmentbindingInflater1", "MediaBrowserCompat", "Lcom/bpjstku/util/constant/RegistrationStatus;", "b", "Lcom/bpjstku/util/constant/Citizenship;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "INotificationSideChannelDefault", "Lcom/bpjstku/util/constant/MembershipType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "onTransact", "asBinder", "notify", "RemoteActionCompatParcelizer", "g", "INotificationSideChannel", "a", "INotificationSideChannelStub", "cancelAll", "INotificationSideChannelStubProxy", "cancel", "connect", "getInterfaceDescriptor", "Ljava/io/File;", "write", "()Ljava/io/File;", "read"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RegisteredMemberRegistration implements Parcelable {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Parcelable.Creator<RegisteredMemberRegistration> CREATOR;
    private static int IconCompatParcelizer;
    private static long read;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public final String a;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    public final MembershipType TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public final String cancelAll;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private final String cancel;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    private final RegistrationStatus b;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public final String g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String notify;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final File INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final File RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Citizenship TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public final String read;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public final String MediaBrowserCompat;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private final String getInterfaceDescriptor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final File INotificationSideChannelStub;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final String asInterface;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final String asBinder;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final File INotificationSideChannelDefault;
    private static final byte[] $$d = {87, 51, -85, 78, -3, 26, -37, 48, 24, -2, 6, 12, 24, -23, 28, 14, 11, 16, 16, 4, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 39;
    private static final byte[] $$a = {110, -73, -111, 99, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 214;
    private static int disconnect = 0;
    private static int getNotifyChildrenChangedOptions = 1;
    private static int getExtras = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration.$$a
            int r8 = r8 * 3
            int r8 = r8 + 84
            int r6 = r6 + 4
            int r7 = r7 * 15
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L30
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration.c(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 36
            int r0 = r6 + 17
            int r7 = r7 * 31
            int r7 = 115 - r7
            int r5 = r5 * 16
            int r5 = 20 - r5
            byte[] r1 = com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration.$$d
            byte[] r0 = new byte[r0]
            int r6 = r6 + 16
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L29:
            r3 = r1[r5]
        L2b:
            int r5 = r5 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration.f(byte, byte, int, java.lang.Object[]):void");
    }

    public RegisteredMemberRegistration(String str, String str2, RegistrationStatus registrationStatus, Citizenship citizenship, MembershipType membershipType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, File file, File file2, File file3, File file4, String str14, String str15, String str16) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentbindingInflater1 = str2;
        this.b = registrationStatus;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = citizenship;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = membershipType;
        this.d = str3;
        this.asBinder = str4;
        this.asInterface = str5;
        this.g = str6;
        this.a = str7;
        this.cancelAll = str8;
        this.cancel = str9;
        this.notify = str10;
        this.INotificationSideChannel = str11;
        this.onTransact = str12;
        this.getInterfaceDescriptor = str13;
        this.INotificationSideChannelStubProxy = file;
        this.INotificationSideChannelStub = file2;
        this.RemoteActionCompatParcelizer = file3;
        this.INotificationSideChannelDefault = file4;
        this.write = str14;
        this.MediaBrowserCompat = str15;
        this.read = str16;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RegisteredMemberRegistration(String str, String str2, RegistrationStatus registrationStatus, Citizenship citizenship, MembershipType membershipType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, File file, File file2, File file3, File file4, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        RegistrationStatus registrationStatus2;
        Citizenship citizenship2;
        MembershipType membershipType2;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        int i2;
        String str24;
        String str25;
        String str26 = (i & 1) != 0 ? "" : str;
        String str27 = (i & 2) != 0 ? "" : str2;
        Object obj = null;
        if ((i & 4) != 0) {
            int i3 = 2 % 2;
            registrationStatus2 = null;
        } else {
            registrationStatus2 = registrationStatus;
        }
        if ((i & 8) != 0) {
            int i4 = getNotifyChildrenChangedOptions + 121;
            disconnect = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            citizenship2 = null;
        } else {
            citizenship2 = citizenship;
        }
        if ((i & 16) != 0) {
            int i5 = 2 % 2;
            membershipType2 = null;
        } else {
            membershipType2 = membershipType;
        }
        if ((i & 32) != 0) {
            int i6 = disconnect + 3;
            getNotifyChildrenChangedOptions = i6 % 128;
            int i7 = i6 % 2;
            str17 = "";
        } else {
            str17 = str3;
        }
        String str28 = (i & 64) != 0 ? "" : str4;
        if ((i & 128) != 0) {
            int i8 = 2 % 2;
            str18 = "";
        } else {
            str18 = str5;
        }
        String str29 = (i & 256) != 0 ? "" : str6;
        if ((i & 512) != 0) {
            int i9 = getNotifyChildrenChangedOptions + 89;
            disconnect = i9 % 128;
            if (i9 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str19 = "";
        } else {
            str19 = str7;
        }
        if ((i & 1024) != 0) {
            int i10 = disconnect + 115;
            getNotifyChildrenChangedOptions = i10 % 128;
            int i11 = i10 % 2;
            str20 = "";
        } else {
            str20 = str8;
        }
        if ((i & 2048) != 0) {
            int i12 = disconnect + 13;
            getNotifyChildrenChangedOptions = i12 % 128;
            if (i12 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str21 = "";
        } else {
            str21 = str9;
        }
        if ((i & 4096) != 0) {
            int i13 = getNotifyChildrenChangedOptions + 109;
            str22 = "";
            disconnect = i13 % 128;
            int i14 = i13 % 2;
            str23 = str22;
        } else {
            str22 = "";
            str23 = str10;
        }
        String str30 = (i & 8192) != 0 ? str22 : str11;
        String str31 = (i & 16384) != 0 ? str22 : str12;
        String str32 = (i & 32768) != 0 ? str22 : str13;
        File file5 = (i & 65536) != 0 ? null : file;
        File file6 = (i & 131072) != 0 ? null : file2;
        File file7 = (i & 262144) != 0 ? null : file3;
        File file8 = (i & 524288) != 0 ? null : file4;
        String str33 = (i & 1048576) != 0 ? str22 : str14;
        if ((i & 2097152) != 0) {
            int i15 = disconnect + 11;
            getNotifyChildrenChangedOptions = i15 % 128;
            i2 = 2;
            int i16 = i15 % 2;
            str24 = str22;
        } else {
            i2 = 2;
            str24 = str15;
        }
        if ((i & 4194304) != 0) {
            int i17 = i2 % i2;
            str25 = str22;
        } else {
            str25 = str16;
        }
        this(str26, str27, registrationStatus2, citizenship2, membershipType2, str17, str28, str18, str29, str19, str20, str21, str23, str30, str31, str32, file5, file6, file7, file8, str33, str24, str25);
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements Parcelable.Creator<RegisteredMemberRegistration> {
        private static final byte[] $$c = {123, -2, -101, -104};
        private static final int $$f = 2;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {12, 11, -9, -106, -34, -13, -3, -4, -23, 20, -30, -20, 3, -6, -13, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
        private static final int $$e = 44;
        private static final byte[] $$a = {94, 6, -99, -107, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 102;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static long b = -6377398940819159759L;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 6787;

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 2
                int r8 = 84 - r8
                byte[] r0 = com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration.TuitionPaymentFragmentbindingInflater1.$$a
                int r7 = r7 * 52
                int r7 = 107 - r7
                int r6 = r6 * 15
                int r6 = 53 - r6
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r8
                r5 = r2
                r8 = r6
                goto L2b
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                int r7 = r7 + 1
                if (r5 != r6) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L29:
                r3 = r0[r7]
            L2b:
                int r8 = r8 + r3
                int r8 = r8 + (-11)
                r3 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration.TuitionPaymentFragmentbindingInflater1.a(byte, byte, byte, java.lang.Object[]):void");
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
        private static void d(short r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 26
                int r0 = 38 - r8
                int r6 = r6 * 3
                int r6 = r6 + 84
                int r7 = r7 * 11
                int r7 = r7 + 4
                byte[] r1 = com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration.TuitionPaymentFragmentbindingInflater1.$$d
                byte[] r0 = new byte[r0]
                int r8 = 37 - r8
                r2 = 0
                if (r1 != 0) goto L19
                r3 = r7
                r6 = r8
                r4 = r2
                goto L2f
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r3
                r3 = r7
                r7 = r4
                r4 = r5
            L2f:
                int r7 = -r7
                int r6 = r6 + r7
                int r6 = r6 + (-10)
                int r7 = r3 + 1
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration.TuitionPaymentFragmentbindingInflater1.d(short, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:24:0x026e  */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RegisteredMemberRegistration[] newArray(int i) throws Throwable {
            Object[] objArr;
            int i2 = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                int iResolveSizeAndState = 2267 - View.resolveSizeAndState(0, 0, 0);
                int doubleTapTimeout = 33 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr2 = new Object[1];
                a(b2, bArr[37], b2, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, iResolveSizeAndState, doubleTapTimeout, -887667012, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{47836, 17210, 35888, 7632}, (char) TextUtils.getTrimmedLength(""), TextUtils.getCapsMode("", 0, 0), new char[]{16770, 37058, 56880, 15227, 50800, 12076, 12949, 54909, 1413, 46062, 4309, 57791, 34312, 34708, 14607, 21401, 38269, 54063, 5430, 56114, 5842, 46721}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{29940, 54312, 59357, 59532}, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 36071), (-573298571) + TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{12096, 61930, 47522, 23380, 47966, 63135, 44040, 57739, 39282, 38146, 56600, 53050, 14442, 34340, 49995}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2267;
                int gidForName = Process.getGidForName("") + 34;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[7];
                Object[] objArr5 = new Object[1];
                a(b3, bArr2[132], b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iKeyCodeFromString, gidForName, -874156483, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i3 = TuitionPaymentFragmentbindingInflater1 + 19;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                int i4 = i3 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                    int i5 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2266;
                    int mirror = 'Q' - AndroidCharacter.getMirror('0');
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[132];
                    byte b5 = bArr3[7];
                    Object[] objArr6 = new Object[1];
                    a(b4, b5, b5, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, i5, mirror, -654680577, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i6 = ((int[]) objArr7[0])[0];
                int i7 = ((int[]) objArr7[3])[0];
                String[] strArr = (String[]) objArr7[1];
                int iIdentityHashCode = System.identityHashCode(this);
                int i8 = ~iIdentityHashCode;
                int i9 = (~((-678750528) | i8)) | 675342363;
                int i10 = ~(iIdentityHashCode | (-126554625));
                int i11 = (((1252347286 + ((i9 | i10) * (-713))) + (i10 * 1426)) + ((~((-129962789) | i8)) * 713)) - 1490606621;
                int i12 = (i11 << 13) ^ i11;
                int i13 = i12 ^ (i12 >>> 17);
                ((int[]) objArr[2])[0] = i13 ^ (i13 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{47803, 9823, 45937, 29678}, (char) (61107 - View.resolveSizeAndState(0, 0, 0)), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{24496, 53670, 26784, 49182, 45874, 6480, 632, 54480, 13362, 1768, 11304, 3337, 6185, 5180, 60237, 35530, 9595, 42247, 11467, 471, 14088, 41423, 5401, 12522, 20992, 25747}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{54468, 38444, 36262, 49440}, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8333), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{56418, 51468, 35201, 11279, 25010, 52202, 31084, 50576, 36481, 31543, 45067, 875, 63557, 55094, 47598, 36724, 10814, 19758}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i15 = i14 + 9;
                    TuitionPaymentFragmentbindingInflater1 = i15 % 128;
                    if (i15 % 2 == 0) {
                        boolean z = applicationContext instanceof ContextWrapper;
                        throw null;
                    }
                    if (applicationContext instanceof ContextWrapper) {
                        int i16 = i14 + 61;
                        TuitionPaymentFragmentbindingInflater1 = i16 % 128;
                        int i17 = i16 % 2;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                }
                int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
                TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                int i19 = i18 % 2;
                try {
                    Object[] objArr10 = {applicationContext, Integer.valueOf(i), 0, -1490606621};
                    byte[] bArr4 = $$d;
                    byte b6 = bArr4[18];
                    Object[] objArr11 = new Object[1];
                    d(b6, bArr4[39], b6, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    byte b7 = bArr4[39];
                    Object[] objArr12 = new Object[1];
                    d(b7, bArr4[18], b7, objArr12);
                    Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                            int i20 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2266;
                            int keyRepeatTimeout = 33 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            byte[] bArr5 = $$a;
                            byte b8 = bArr5[132];
                            byte b9 = bArr5[7];
                            Object[] objArr14 = new Object[1];
                            a(b8, b9, b9, objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetBefore, i20, keyRepeatTimeout, -654680577, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                        try {
                            Object[] objArr15 = new Object[1];
                            c(new char[]{0, 0, 0, 0}, new char[]{47836, 17210, 35888, 7632}, (char) (AndroidCharacter.getMirror('0') - '0'), Process.myTid() >> 22, new char[]{16770, 37058, 56880, 15227, 50800, 12076, 12949, 54909, 1413, 46062, 4309, 57791, 34312, 34708, 14607, 21401, 38269, 54063, 5430, 56114, 5842, 46721}, objArr15);
                            Class<?> cls4 = Class.forName((String) objArr15[0]);
                            Object[] objArr16 = new Object[1];
                            c(new char[]{0, 0, 0, 0}, new char[]{29940, 54312, 59357, 59532}, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36071), (Process.myTid() >> 22) - 573298572, new char[]{12096, 61930, 47522, 23380, 47966, 63135, 44040, 57739, 39282, 38146, 56600, 53050, 14442, 34340, 49995}, objArr16);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                                int iGreen = Color.green(0) + 2267;
                                int i21 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32;
                                byte[] bArr6 = $$a;
                                byte b10 = bArr6[7];
                                byte b11 = b10;
                                byte b12 = bArr6[132];
                                byte b13 = b10;
                                Object[] objArr17 = new Object[1];
                                a(b11, b12, b13, objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iGreen, i21, -874156483, false, (String) objArr17[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                                int i22 = 2267 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 33;
                                byte[] bArr7 = $$a;
                                byte b14 = bArr7[7];
                                Object[] objArr18 = new Object[1];
                                a(b14, bArr7[37], b14, objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAxisFromString, i22, minimumFlingVelocity, -887667012, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr13;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i23 = ((int[]) objArr[3])[0];
            int i24 = ((int[]) objArr[0])[0];
            if (i24 == i23) {
                int i25 = ((int[]) objArr[2])[0];
                int i26 = ((int[]) objArr[0])[0];
                int i27 = ((int[]) objArr[3])[0];
                new int[1][0] = i26;
                new int[1][0] = i27;
                int i28 = ~i;
                int i29 = i25 + ((((-615070855) + (((~((-532901351) | i28)) | (~((-275811966) | i))) * (-370))) + ((((~(i28 | (-275811966))) | (~((-532901351) | i))) | (-536080384)) * (-370))) - 781246464);
                int i30 = (i29 << 13) ^ i29;
                int i31 = i30 ^ (i30 >>> 17);
                int[] iArr = {i31 ^ (i31 << 5)};
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr[1];
                if (strArr2 != null) {
                    int i32 = TuitionPaymentFragmentbindingInflater1 + 97;
                    int i33 = i32 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i33;
                    int i34 = 2;
                    int i35 = i32 % 2 != 0 ? 1 : 0;
                    int i36 = i33 + 79;
                    TuitionPaymentFragmentbindingInflater1 = i36 % 128;
                    int i37 = i36 % 2;
                    while (i35 < strArr2.length) {
                        int i38 = TuitionPaymentFragmentbindingInflater1 + 55;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i38 % 128;
                        if (i38 % i34 != 0) {
                            arrayList.add(strArr2[i35]);
                            i35 += 41;
                        } else {
                            arrayList.add(strArr2[i35]);
                            i35++;
                        }
                        i34 = 2;
                    }
                }
                int[] iArr2 = new int[i24];
                int i39 = i24 - 1;
                iArr2[i39] = 1;
                Toast.makeText((Context) null, iArr2[((i24 * i39) % 2) - 1], 1).show();
                int i40 = ((int[]) objArr[2])[0];
                int i41 = ((int[]) objArr[0])[0];
                int i42 = ((int[]) objArr[3])[0];
                new int[1][0] = i41;
                new int[1][0] = i42;
                int i43 = i40 + (((~(138698665 | i)) | (-809239461)) * 398) + 868174647 + (((~(138698665 | (~i))) | (-809239461)) * 398);
                int i44 = (i43 << 13) ^ i43;
                int i45 = i44 ^ (i44 >>> 17);
                int[] iArr3 = {i45 ^ (i45 << 5)};
            }
            return new RegisteredMemberRegistration[i];
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
            int i4 = $11 + 27;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                int i6 = $10 + 77;
                $11 = i6 % 128;
                int i7 = i6 % i2;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char defaultSize = (char) (8328 - View.getDefaultSize(0, 0));
                        int pressedStateDuration = 1235 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int size = View.MeasureSpec.getSize(0) + 35;
                        byte b2 = (byte) ($$f - i2);
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, pressedStateDuration, size, -653973969, false, $$g(b2, b3, b3), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char c2 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int i8 = 2765 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 14;
                        int i9 = $$f;
                        byte b4 = (byte) i9;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, i8, iResolveSizeAndState, 1504416861, false, $$g((byte) (i9 - 2), b4, (byte) (b4 - 2)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43324), Color.red(0) + 253, View.resolveSize(0, 0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 65201);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2891;
                        int size2 = 17 - View.MeasureSpec.getSize(0);
                        byte b5 = (byte) ($$f - 2);
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAxisFromString, iNormalizeMetaState, size2, 2012627446, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RegisteredMemberRegistration createFromParcel(Parcel parcel) {
            Citizenship citizenshipCreateFromParcel;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            MembershipType membershipTypeCreateFromParcel = null;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                membershipTypeCreateFromParcel.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RegistrationStatus registrationStatusCreateFromParcel = parcel.readInt() == 0 ? null : RegistrationStatus.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                int i3 = TuitionPaymentFragmentbindingInflater1 + 29;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                if (i3 % 2 != 0) {
                    membershipTypeCreateFromParcel.hashCode();
                    throw null;
                }
                citizenshipCreateFromParcel = null;
            } else {
                citizenshipCreateFromParcel = Citizenship.CREATOR.createFromParcel(parcel);
            }
            Citizenship citizenship = citizenshipCreateFromParcel;
            if (parcel.readInt() == 0) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
            } else {
                membershipTypeCreateFromParcel = MembershipType.CREATOR.createFromParcel(parcel);
            }
            return new RegisteredMemberRegistration(string, string2, registrationStatusCreateFromParcel, citizenship, membershipTypeCreateFromParcel, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (File) parcel.readSerializable(), (File) parcel.readSerializable(), (File) parcel.readSerializable(), (File) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r7, short r8, short r9) {
            /*
                int r7 = r7 * 2
                int r7 = 1 - r7
                byte[] r0 = com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration.TuitionPaymentFragmentbindingInflater1.$$c
                int r9 = r9 * 4
                int r9 = 3 - r9
                int r8 = r8 + 102
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r4 = r2
                r9 = r7
                goto L2b
            L15:
                r3 = r2
            L16:
                int r9 = r9 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L25:
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L2b:
                int r8 = -r8
                int r8 = r8 + r9
                r9 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration.TuitionPaymentFragmentbindingInflater1.$$g(short, short, short):java.lang.String");
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 101;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - KeyEvent.keyCodeFromString("")), 2625 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 13 - TextUtils.getTrimmedLength(""), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() * (read ^ 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - Color.argb(0, 0, 0, 0)), 480 - ImageFormat.getBitsPerPixel(0), TextUtils.indexOf((CharSequence) "", '0') + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19472 - (ViewConfiguration.getTapTimeout() >> 16)), 2624 - Gravity.getAbsoluteGravity(0, 0), 13 - Drawable.resolveOpacity(0, 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (read ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 39421), Color.blue(0) + 481, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $11 + 95;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                try {
                    Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.indexOf("", "") + 39422), TextUtils.getOffsetAfter("", 0) + 481, Color.rgb(0, 0, 0) + 16777253, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            try {
                Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (39421 - MotionEvent.axisFromString("")), 481 - View.MeasureSpec.getSize(0), 36 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        objArr[0] = new String(cArr2);
    }

    public final File TuitionPaymentFragmentbindingInflater1() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
            int i2 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 875;
            int packedPositionType = 10 - ExpandableListView.getPackedPositionType(0L);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[5], bArr[28], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i2, packedPositionType, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{6122, 32174, 50041, 10520, 48840, 1173, 27181, 65448, 17852, 43867, 12619, 34529, 60534, 29239, 51173, 11659, 45910, 6451, 28321, 62581, 23092, 44999}, 27211 - View.resolveSizeAndState(0, 0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{6126, 2166, 10440, 18760, 27068, 35387, 43657, 52014, 60262, 3059, 11341, 19652, 27950, 36283, 44544}, Color.green(0) + 8081, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int doubleTapTimeout = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int keyRepeatDelay = 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte[] bArr2 = $$a;
            byte b = (byte) (bArr2[12] + 1);
            byte b2 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b, b2, b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity, doubleTapTimeout, keyRepeatDelay, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = getNotifyChildrenChangedOptions + 93;
            disconnect = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                int iRed = Color.red(0) + 876;
                int jumpTapTimeout = 10 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                byte b3 = $$a[7];
                Object[] objArr6 = new Object[1];
                c((byte) 88, b3, b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(edgeSlop, iRed, jumpTapTimeout, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i5 = (-4297898) + (((~((-143661274) | (~iMaxMemory))) | 103351044) * (-591)) + ((iMaxMemory | (-143661274)) * 591) + 886726373;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{6122, 35088, 10757, 52006, 27696, 3371, 44625, 20246, 57410, 33126, 8809, 49954, 25782, 1433, 42649, 18361, 63661, 39335, 15045, 56285, 31995, 7674, 48887, 24557, 61714, 37378}, 40693 - Color.green(0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{6120, 20035, 42115, 6862, 28954, 55124, 3473, 25569, 55827, 12382, 38533, 52477, 9012, 39283, 65449, 22001, 35892, 57960}, View.MeasureSpec.getMode(0) + 22973, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i8 = disconnect + 107;
                getNotifyChildrenChangedOptions = i8 % 128;
                int i9 = i8 % 2;
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i10 = getNotifyChildrenChangedOptions + 75;
                    disconnect = i10 % 128;
                    int i11 = i10 % 2;
                }
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{6113, 39645, 3475, 45135, 9081, 54772, 22688, 52068, 32340, 57674, 37886, 1711, 35180, 15412, 44780, 20959}, 36150 - TextUtils.indexOf((CharSequence) "", '0'), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{6114, 43040, 26736, 10376, 59587, 43241, 26917, 10587, 59835, 43437, 27118, 10758, 60028, 43623, 27325, 10959}, 49103 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 886726373};
                byte[] bArr3 = $$d;
                byte b4 = (byte) (-bArr3[21]);
                byte b5 = bArr3[23];
                Object[] objArr13 = new Object[1];
                f(b4, b5, b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr3[23];
                byte b7 = (byte) (-bArr3[21]);
                Object[] objArr14 = new Object[1];
                f(b6, b7, b7, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 876;
                        int iResolveOpacity = 10 - Drawable.resolveOpacity(0, 0);
                        byte b8 = $$a[7];
                        Object[] objArr15 = new Object[1];
                        c((byte) 88, b8, b8, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetAfter, iMakeMeasureSpec, iResolveOpacity, 2012931276, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(new char[]{6122, 32174, 50041, 10520, 48840, 1173, 27181, 65448, 17852, 43867, 12619, 34529, 60534, 29239, 51173, 11659, 45910, 6451, 28321, 62581, 23092, 44999}, 27211 - TextUtils.indexOf("", ""), objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e(new char[]{6126, 2166, 10440, 18760, 27068, 35387, 43657, 52014, 60262, 3059, 11341, 19652, 27950, 36283, 44544}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8081, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 876;
                            int iRed2 = 10 - Color.red(0);
                            byte[] bArr4 = $$a;
                            byte b9 = (byte) (bArr4[12] + 1);
                            byte b10 = bArr4[7];
                            Object[] objArr18 = new Object[1];
                            c(b9, b10, b10, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iMakeMeasureSpec2, iRed2, 2012020043, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                            int i12 = 876 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 10;
                            byte[] bArr5 = $$a;
                            Object[] objArr19 = new Object[1];
                            c(bArr5[5], bArr5[28], bArr5[7], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(tapTimeout, i12, maxKeyCode, -1650998592, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i13 = ((int[]) objArr[2])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 == i13) {
            int i15 = getNotifyChildrenChangedOptions + 57;
            disconnect = i15 % 128;
            int i16 = i15 % 2;
            int i17 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyPid = Process.myPid();
            int i18 = ~iMyPid;
            int i19 = ~(870783499 | i18);
            int i20 = i17 + (-73732540) + (((-870784576) | i19) * (-712)) + (((~(iMyPid | (-1077))) | (~(i18 | 870784575))) * (-712)) + ((830473270 | i19) * 712);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr20[1])[0] = i22 ^ (i22 << 5);
        } else {
            int[] iArr = new int[i14];
            int i23 = i14 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i23) % 2) - 1], 1).show();
            int i24 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i25 = i24 + 498110484 + (((-76021787) | (~iIdentityHashCode)) * (-490)) + (((~(iIdentityHashCode | 589496165)) | (-665517952)) * 490) + 632511762;
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr21[1])[0] = i27 ^ (i27 << 5);
        }
        return this.INotificationSideChannelDefault;
    }

    public static /* synthetic */ RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegisteredMemberRegistration registeredMemberRegistration, String str, String str2, RegistrationStatus registrationStatus, Citizenship citizenship, MembershipType membershipType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, File file, File file2, File file3, File file4, String str14, String str15, String str16, int i) {
        String str17;
        String str18;
        RegistrationStatus registrationStatus2;
        MembershipType membershipType2;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        int i2 = 2 % 2;
        int i3 = disconnect + 89;
        int i4 = i3 % 128;
        getNotifyChildrenChangedOptions = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 111;
            disconnect = i6 % 128;
            int i7 = i6 % 2;
            str17 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        } else {
            str17 = str;
        }
        if ((i & 2) != 0) {
            int i8 = disconnect + 55;
            getNotifyChildrenChangedOptions = i8 % 128;
            if (i8 % 2 == 0) {
                str18 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                int i9 = 79 / 0;
            } else {
                str18 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
            }
        } else {
            str18 = str2;
        }
        if ((i & 4) != 0) {
            int i10 = getNotifyChildrenChangedOptions + 45;
            disconnect = i10 % 128;
            int i11 = i10 % 2;
            registrationStatus2 = registeredMemberRegistration.b;
        } else {
            registrationStatus2 = registrationStatus;
        }
        Citizenship citizenship2 = (i & 8) != 0 ? registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : citizenship;
        if ((i & 16) != 0) {
            int i12 = disconnect + 69;
            getNotifyChildrenChangedOptions = i12 % 128;
            int i13 = i12 % 2;
            membershipType2 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        } else {
            membershipType2 = membershipType;
        }
        String str25 = (i & 32) != 0 ? registeredMemberRegistration.d : str3;
        if ((i & 64) != 0) {
            int i14 = getNotifyChildrenChangedOptions + 123;
            disconnect = i14 % 128;
            int i15 = i14 % 2;
            str19 = registeredMemberRegistration.asBinder;
        } else {
            str19 = str4;
        }
        if ((i & 128) != 0) {
            int i16 = getNotifyChildrenChangedOptions + 3;
            disconnect = i16 % 128;
            int i17 = i16 % 2;
            str20 = registeredMemberRegistration.asInterface;
        } else {
            str20 = str5;
        }
        String str26 = (i & 256) != 0 ? registeredMemberRegistration.g : str6;
        if ((i & 512) != 0) {
            int i18 = disconnect + 97;
            getNotifyChildrenChangedOptions = i18 % 128;
            if (i18 % 2 == 0) {
                str21 = registeredMemberRegistration.a;
                int i19 = 86 / 0;
            } else {
                str21 = registeredMemberRegistration.a;
            }
        } else {
            str21 = str7;
        }
        String str27 = (i & 1024) != 0 ? registeredMemberRegistration.cancelAll : str8;
        String str28 = (i & 2048) != 0 ? registeredMemberRegistration.cancel : str9;
        String str29 = (i & 4096) != 0 ? registeredMemberRegistration.notify : str10;
        String str30 = (i & 8192) != 0 ? registeredMemberRegistration.INotificationSideChannel : str11;
        if ((i & 16384) != 0) {
            int i20 = disconnect + 71;
            str22 = str29;
            getNotifyChildrenChangedOptions = i20 % 128;
            if (i20 % 2 == 0) {
                str23 = registeredMemberRegistration.onTransact;
                int i21 = 99 / 0;
            } else {
                str23 = registeredMemberRegistration.onTransact;
            }
        } else {
            str22 = str29;
            str23 = str12;
        }
        String str31 = (32768 & i) != 0 ? registeredMemberRegistration.getInterfaceDescriptor : str13;
        File file5 = (i & 65536) != 0 ? registeredMemberRegistration.INotificationSideChannelStubProxy : file;
        File file6 = (i & 131072) != 0 ? registeredMemberRegistration.INotificationSideChannelStub : file2;
        File file7 = (i & 262144) != 0 ? registeredMemberRegistration.RemoteActionCompatParcelizer : file3;
        File file8 = (i & 524288) != 0 ? registeredMemberRegistration.INotificationSideChannelDefault : file4;
        String str32 = (i & 1048576) != 0 ? registeredMemberRegistration.write : str14;
        String str33 = (i & 2097152) != 0 ? registeredMemberRegistration.MediaBrowserCompat : str15;
        if ((i & 4194304) != 0) {
            int i22 = disconnect + 7;
            getNotifyChildrenChangedOptions = i22 % 128;
            int i23 = i22 % 2;
            str24 = registeredMemberRegistration.read;
        } else {
            str24 = str16;
        }
        return new RegisteredMemberRegistration(str17, str18, registrationStatus2, citizenship2, membershipType2, str25, str19, str20, str26, str21, str27, str28, str22, str30, str23, str31, file5, file6, file7, file8, str32, str33, str24);
    }

    static {
        IconCompatParcelizer = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        CREATOR = new TuitionPaymentFragmentbindingInflater1();
        int i = getExtras + 27;
        IconCompatParcelizer = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RegisteredMemberRegistration() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = disconnect + 25;
        int i3 = i2 % 128;
        getNotifyChildrenChangedOptions = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 83;
        disconnect = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 111;
        int i3 = i2 % 128;
        disconnect = i3;
        int i4 = i2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RegisteredMemberRegistration)) {
            int i5 = i3 + 121;
            getNotifyChildrenChangedOptions = i5 % 128;
            return i5 % 2 == 0;
        }
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) p0;
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            int i6 = disconnect + 125;
            getNotifyChildrenChangedOptions = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1)) {
            return false;
        }
        if (this.b != registeredMemberRegistration.b) {
            int i8 = getNotifyChildrenChangedOptions + 83;
            disconnect = i8 % 128;
            return i8 % 2 != 0;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i9 = disconnect + 39;
            getNotifyChildrenChangedOptions = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2 || !Intrinsics.areEqual(this.d, registeredMemberRegistration.d) || !Intrinsics.areEqual(this.asBinder, registeredMemberRegistration.asBinder)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asInterface, registeredMemberRegistration.asInterface)) {
            int i11 = getNotifyChildrenChangedOptions + 83;
            disconnect = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.g, registeredMemberRegistration.g)) {
            int i13 = disconnect + 119;
            getNotifyChildrenChangedOptions = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.a, registeredMemberRegistration.a)) {
            int i15 = getNotifyChildrenChangedOptions + 29;
            disconnect = i15 % 128;
            return i15 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.cancelAll, registeredMemberRegistration.cancelAll)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.cancel, registeredMemberRegistration.cancel)) {
            int i16 = getNotifyChildrenChangedOptions + 93;
            disconnect = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }
        if ((!Intrinsics.areEqual(this.notify, registeredMemberRegistration.notify)) || !Intrinsics.areEqual(this.INotificationSideChannel, registeredMemberRegistration.INotificationSideChannel) || !Intrinsics.areEqual(this.onTransact, registeredMemberRegistration.onTransact) || !Intrinsics.areEqual(this.getInterfaceDescriptor, registeredMemberRegistration.getInterfaceDescriptor) || !Intrinsics.areEqual(this.INotificationSideChannelStubProxy, registeredMemberRegistration.INotificationSideChannelStubProxy) || !Intrinsics.areEqual(this.INotificationSideChannelStub, registeredMemberRegistration.INotificationSideChannelStub)) {
            return false;
        }
        if (Intrinsics.areEqual(this.RemoteActionCompatParcelizer, registeredMemberRegistration.RemoteActionCompatParcelizer)) {
            return Intrinsics.areEqual(this.INotificationSideChannelDefault, registeredMemberRegistration.INotificationSideChannelDefault) && Intrinsics.areEqual(this.write, registeredMemberRegistration.write) && Intrinsics.areEqual(this.MediaBrowserCompat, registeredMemberRegistration.MediaBrowserCompat) && Intrinsics.areEqual(this.read, registeredMemberRegistration.read);
        }
        int i18 = getNotifyChildrenChangedOptions + 111;
        disconnect = i18 % 128;
        return i18 % 2 != 0;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int i;
        int iHashCode7;
        int i2 = 2 % 2;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (str == null) {
            int i3 = getNotifyChildrenChangedOptions + 1;
            disconnect = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        RegistrationStatus registrationStatus = this.b;
        if (registrationStatus == null) {
            int i5 = disconnect + 73;
            getNotifyChildrenChangedOptions = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = registrationStatus.hashCode();
        }
        Citizenship citizenship = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (citizenship == null) {
            int i7 = disconnect + 31;
            getNotifyChildrenChangedOptions = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = citizenship.hashCode();
            int i9 = getNotifyChildrenChangedOptions + 3;
            disconnect = i9 % 128;
            int i10 = i9 % 2;
        }
        MembershipType membershipType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode9 = membershipType == null ? 0 : membershipType.hashCode();
        String str3 = this.d;
        if (str3 == null) {
            int i11 = getNotifyChildrenChangedOptions + 75;
            disconnect = i11 % 128;
            int i12 = i11 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str3.hashCode();
        }
        String str4 = this.asBinder;
        if (str4 == null) {
            int i13 = disconnect + 77;
            getNotifyChildrenChangedOptions = i13 % 128;
            int i14 = i13 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str4.hashCode();
        }
        String str5 = this.asInterface;
        if (str5 == null) {
            int i15 = disconnect + 89;
            getNotifyChildrenChangedOptions = i15 % 128;
            iHashCode6 = i15 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode6 = str5.hashCode();
        }
        String str6 = this.g;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.a;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.cancelAll;
        int iHashCode12 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.cancel;
        int iHashCode13 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.notify;
        int iHashCode14 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.INotificationSideChannel;
        int iHashCode15 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.onTransact;
        int iHashCode16 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.getInterfaceDescriptor;
        int iHashCode17 = str13 == null ? 0 : str13.hashCode();
        File file = this.INotificationSideChannelStubProxy;
        int iHashCode18 = file == null ? 0 : file.hashCode();
        File file2 = this.INotificationSideChannelStub;
        int iHashCode19 = file2 == null ? 0 : file2.hashCode();
        File file3 = this.RemoteActionCompatParcelizer;
        if (file3 == null) {
            int i16 = disconnect + 91;
            i = iHashCode15;
            getNotifyChildrenChangedOptions = i16 % 128;
            iHashCode7 = i16 % 2 == 0 ? 1 : 0;
        } else {
            i = iHashCode15;
            iHashCode7 = file3.hashCode();
        }
        File file4 = this.INotificationSideChannelDefault;
        int iHashCode20 = file4 == null ? 0 : file4.hashCode();
        String str14 = this.write;
        int iHashCode21 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.MediaBrowserCompat;
        int iHashCode22 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.read;
        return (((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode8) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode9) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + i) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode7) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + (str16 != null ? str16.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str2 = this.TuitionPaymentFragmentbindingInflater1;
        RegistrationStatus registrationStatus = this.b;
        Citizenship citizenship = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        MembershipType membershipType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str3 = this.d;
        String str4 = this.asBinder;
        String str5 = this.asInterface;
        String str6 = this.g;
        String str7 = this.a;
        String str8 = this.cancelAll;
        String str9 = this.cancel;
        String str10 = this.notify;
        String str11 = this.INotificationSideChannel;
        String str12 = this.onTransact;
        String str13 = this.getInterfaceDescriptor;
        File file = this.INotificationSideChannelStubProxy;
        File file2 = this.INotificationSideChannelStub;
        File file3 = this.RemoteActionCompatParcelizer;
        File file4 = this.INotificationSideChannelDefault;
        String str14 = this.write;
        String str15 = this.MediaBrowserCompat;
        String str16 = this.read;
        StringBuilder sb = new StringBuilder("RegisteredMemberRegistration(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str2);
        sb.append(", b=");
        sb.append(registrationStatus);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(citizenship);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(membershipType);
        sb.append(", d=");
        sb.append(str3);
        sb.append(", asBinder=");
        sb.append(str4);
        sb.append(", asInterface=");
        sb.append(str5);
        sb.append(", g=");
        sb.append(str6);
        sb.append(", a=");
        sb.append(str7);
        sb.append(", cancelAll=");
        sb.append(str8);
        sb.append(", cancel=");
        sb.append(str9);
        sb.append(", notify=");
        sb.append(str10);
        sb.append(", INotificationSideChannel=");
        sb.append(str11);
        sb.append(", onTransact=");
        sb.append(str12);
        sb.append(", getInterfaceDescriptor=");
        sb.append(str13);
        sb.append(", INotificationSideChannelStubProxy=");
        sb.append(file);
        sb.append(", INotificationSideChannelStub=");
        sb.append(file2);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(file3);
        sb.append(", INotificationSideChannelDefault=");
        sb.append(file4);
        sb.append(", write=");
        sb.append(str14);
        sb.append(", MediaBrowserCompat=");
        sb.append(str15);
        sb.append(", read=");
        sb.append(str16);
        sb.append(")");
        String string = sb.toString();
        int i2 = disconnect + 77;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 59;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        RegistrationStatus registrationStatus = this.b;
        if (registrationStatus == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            registrationStatus.writeToParcel(p0, p1);
        }
        Citizenship citizenship = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (citizenship == null) {
            p0.writeInt(0);
            int i4 = disconnect + 87;
            getNotifyChildrenChangedOptions = i4 % 128;
            int i5 = i4 % 2;
        } else {
            p0.writeInt(1);
            citizenship.writeToParcel(p0, p1);
        }
        MembershipType membershipType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (membershipType == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            membershipType.writeToParcel(p0, p1);
            int i6 = getNotifyChildrenChangedOptions + 107;
            disconnect = i6 % 128;
            int i7 = i6 % 2;
        }
        p0.writeString(this.d);
        p0.writeString(this.asBinder);
        p0.writeString(this.asInterface);
        p0.writeString(this.g);
        p0.writeString(this.a);
        p0.writeString(this.cancelAll);
        p0.writeString(this.cancel);
        p0.writeString(this.notify);
        p0.writeString(this.INotificationSideChannel);
        p0.writeString(this.onTransact);
        p0.writeString(this.getInterfaceDescriptor);
        p0.writeSerializable(this.INotificationSideChannelStubProxy);
        p0.writeSerializable(this.INotificationSideChannelStub);
        p0.writeSerializable(this.RemoteActionCompatParcelizer);
        p0.writeSerializable(this.INotificationSideChannelDefault);
        p0.writeString(this.write);
        p0.writeString(this.MediaBrowserCompat);
        p0.writeString(this.read);
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        read = 4695908138155949712L;
    }
}
