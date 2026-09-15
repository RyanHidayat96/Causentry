package com.dynatrace.android.agent;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.NetworkInfo;
import android.os.Looper;
import android.os.SystemClock;
import com.dynatrace.android.agent.comm.InvalidResponseException;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import defpackage.SurfaceRequest1;
import defpackage.SurfaceRequest2;
import defpackage.SurfaceRequest5;
import defpackage.SurfaceRequestExternalSyntheticLambda1;
import defpackage.SurfaceRequestExternalSyntheticLambda5;
import defpackage.SurfaceRequestExternalSyntheticLambda7;
import defpackage.SurfaceRequestExternalSyntheticLambda8;
import defpackage.SurfaceRequestResultResultCode;
import defpackage.ViewPort;
import defpackage.addRequestCancellationListener;
import defpackage.addUseCase;
import defpackage.clearTransformationInfoListener;
import defpackage.getAppTargetRotation;
import defpackage.getDeferrableSurface;
import defpackage.isEffectTargetsSupported;
import defpackage.isMirroringRequired;
import defpackage.isServiced;
import defpackage.lambdaprovideSurface4;
import defpackage.lambdaprovideSurface5;
import defpackage.lambdasetTransformationInfoListener8;
import defpackage.mergeConfigs;
import defpackage.notifyActive;
import defpackage.notifyInactive;
import defpackage.removeStateChangeCallback;
import defpackage.snapToSurfaceRotation;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class CommunicationManager {
    public static final String b;
    private clearTransformationInfoListener INotificationSideChannel;
    private Timer INotificationSideChannelStubProxy;
    public isEffectTargetsSupported TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public SurfaceRequest2 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public ThreadPoolExecutor asBinder;
    public Thread cancelAll;
    private addRequestCancellationListener notify;
    public SurfaceRequest5 onTransact;
    private lambdasetTransformationInfoListener8.TuitionPaymentFragmentspecialinlinedviewModeldefault1 INotificationSideChannelStub = new lambdasetTransformationInfoListener8.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    public SurfaceRequestExternalSyntheticLambda5 cancel = SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public AtomicBoolean d = new AtomicBoolean(false);
    public AtomicBoolean g = new AtomicBoolean(false);
    public AtomicBoolean asInterface = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f759a = false;
    private long getInterfaceDescriptor = 0;
    public lambdaprovideSurface4 TuitionPaymentFragmentbindingInflater1 = null;
    public SurfaceRequestResultResultCode TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 INotificationSideChannelDefault = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, 0);

    /* JADX INFO: loaded from: classes4.dex */
    enum SendState {
        NO_DATA,
        DATA_NOT_SENT,
        MORE_DATA_AVAILABLE,
        FINISHED
    }

    static /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(CommunicationManager communicationManager, ServerConfiguration serverConfiguration, SurfaceRequest1 surfaceRequest1, int i, boolean z, long j, long j2) {
        return communicationManager.TuitionPaymentFragmentspecialinlinedviewModeldefault3(serverConfiguration, surfaceRequest1, i, z, j, j2, false);
    }

    static /* synthetic */ clearTransformationInfoListener asBinder(CommunicationManager communicationManager) {
        communicationManager.INotificationSideChannel = null;
        return null;
    }

    static /* synthetic */ boolean g(CommunicationManager communicationManager) {
        communicationManager.f759a = true;
        return true;
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("CommunicationManager");
        b = sb.toString();
    }

    public CommunicationManager(addRequestCancellationListener addrequestcancellationlistener) {
        this.notify = addrequestcancellationlistener;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z) {
        clearTransformationInfoListener cleartransformationinfolistener;
        synchronized (this) {
            if (this.INotificationSideChannelStubProxy != null) {
                return;
            }
            if (z || (cleartransformationinfolistener = this.INotificationSideChannel) == null) {
                this.INotificationSideChannel = new clearTransformationInfoListener();
            } else {
                synchronized (cleartransformationinfolistener) {
                    cleartransformationinfolistener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(cleartransformationinfolistener.b);
                }
            }
            Timer timer = new Timer(b);
            this.INotificationSideChannelStubProxy = timer;
            timer.schedule(new TuitionPaymentFragmentbindingInflater1(), this.f759a ? 0L : 100L, 10000L);
        }
    }

    public final void b() {
        synchronized (this) {
            Timer timer = this.INotificationSideChannelStubProxy;
            if (timer != null) {
                timer.cancel();
                this.INotificationSideChannelStubProxy.purge();
            }
            this.INotificationSideChannelStubProxy = null;
            addRequestCancellationListener addrequestcancellationlistener = this.notify;
            synchronized (addrequestcancellationlistener.b) {
                addrequestcancellationlistener.b.clear();
                addrequestcancellationlistener.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0L;
            }
            clearTransformationInfoListener cleartransformationinfolistener = this.INotificationSideChannel;
            if (cleartransformationinfolistener != null) {
                cleartransformationinfolistener.b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0300  */
    /* JADX WARN: Code duplicated, block: B:113:0x0315  */
    /* JADX WARN: Code duplicated, block: B:116:0x0335  */
    /* JADX WARN: Code duplicated, block: B:120:0x0277 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x022d A[Catch: all -> 0x030b, TRY_LEAVE, TryCatch #4 {all -> 0x030b, blocks: (B:62:0x022d, B:68:0x0243, B:72:0x024e, B:74:0x0264, B:39:0x014e, B:41:0x016b, B:45:0x0195, B:55:0x01ea, B:60:0x0219, B:44:0x018d, B:46:0x01bf, B:52:0x01da, B:54:0x01df), top: B:124:0x014e }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0233  */
    /* JADX WARN: Code duplicated, block: B:67:0x023f A[PHI: r0
  0x023f: PHI (r0v21 com.dynatrace.android.agent.CommunicationManager$SendState) = 
  (r0v20 com.dynatrace.android.agent.CommunicationManager$SendState)
  (r0v25 com.dynatrace.android.agent.CommunicationManager$SendState)
 binds: [B:76:0x0268, B:64:0x0231] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0243 A[Catch: all -> 0x030b, TRY_ENTER, TryCatch #4 {all -> 0x030b, blocks: (B:62:0x022d, B:68:0x0243, B:72:0x024e, B:74:0x0264, B:39:0x014e, B:41:0x016b, B:45:0x0195, B:55:0x01ea, B:60:0x0219, B:44:0x018d, B:46:0x01bf, B:52:0x01da, B:54:0x01df), top: B:124:0x014e }] */
    /* JADX WARN: Code duplicated, block: B:70:0x024b  */
    /* JADX WARN: Code duplicated, block: B:71:0x024d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0264 A[Catch: all -> 0x030b, TRY_LEAVE, TryCatch #4 {all -> 0x030b, blocks: (B:62:0x022d, B:68:0x0243, B:72:0x024e, B:74:0x0264, B:39:0x014e, B:41:0x016b, B:45:0x0195, B:55:0x01ea, B:60:0x0219, B:44:0x018d, B:46:0x01bf, B:52:0x01da, B:54:0x01df), top: B:124:0x014e }] */
    /* JADX WARN: Code duplicated, block: B:77:0x026a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0272  */
    /* JADX WARN: Code duplicated, block: B:83:0x02b5 A[Catch: all -> 0x02c5, Exception -> 0x02c7, TRY_LEAVE, TryCatch #2 {Exception -> 0x02c7, blocks: (B:81:0x0277, B:83:0x02b5), top: B:120:0x0277, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x02d2 A[Catch: all -> 0x0309, DONT_GENERATE, TRY_ENTER, TryCatch #3 {all -> 0x0309, blocks: (B:79:0x0274, B:80:0x0276, B:90:0x02d2, B:91:0x02d3, B:93:0x02d7, B:94:0x02da, B:103:0x0307, B:104:0x0308, B:81:0x0277, B:83:0x02b5, B:87:0x02c7, B:89:0x02cb), top: B:123:0x0274, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x02d7 A[Catch: all -> 0x0309, TryCatch #3 {all -> 0x0309, blocks: (B:79:0x0274, B:80:0x0276, B:90:0x02d2, B:91:0x02d3, B:93:0x02d7, B:94:0x02da, B:103:0x0307, B:104:0x0308, B:81:0x0277, B:83:0x02b5, B:87:0x02c7, B:89:0x02cb), top: B:123:0x0274, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x02da A[Catch: all -> 0x0309, TRY_LEAVE, TryCatch #3 {all -> 0x0309, blocks: (B:79:0x0274, B:80:0x0276, B:90:0x02d2, B:91:0x02d3, B:93:0x02d7, B:94:0x02da, B:103:0x0307, B:104:0x0308, B:81:0x0277, B:83:0x02b5, B:87:0x02c7, B:89:0x02cb), top: B:123:0x0274, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02e0  */
    private SendState TuitionPaymentFragmentspecialinlinedviewModeldefault2(ServerConfiguration serverConfiguration, long j) throws Throwable {
        CommunicationManager communicationManager;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        File file;
        int i;
        int i2;
        String str;
        long j2;
        long j3;
        long j4;
        boolean z;
        isMirroringRequired ismirroringrequired;
        boolean z2;
        boolean z3;
        isEffectTargetsSupported iseffecttargetssupported;
        SendState sendState;
        StringBuilder sb;
        int iDelete;
        StringBuilder sb2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4;
        File file2;
        if (!this.INotificationSideChannelDefault.b()) {
            return SendState.NO_DATA;
        }
        try {
            long jElapsedRealtime = this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime();
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                StringBuilder sb3 = new StringBuilder("sendMonitoringData begin @");
                sb3.append(jElapsedRealtime);
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb3.toString());
            }
            notifyInactive.TuitionPaymentFragmentspecialinlinedviewModeldefault1().b();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jElapsedRealtime, serverConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > 0);
            if (serverConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > 0) {
                isEffectTargetsSupported iseffecttargetssupported2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i3 = serverConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                synchronized (iseffecttargetssupported2) {
                    try {
                        iseffecttargetssupported2.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(notifyActive.TuitionPaymentFragmentbindingInflater1, i3);
                    } catch (Exception unused) {
                        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            String str2 = isEffectTargetsSupported.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            ViewPort.a("Database error.");
                        }
                    }
                }
            }
            isEffectTargetsSupported iseffecttargetssupported3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            long j5 = (((long) serverConfiguration.TuitionPaymentFragmentbindingInflater1) * 1024) - 5;
            Cursor cursorQuery = iseffecttargetssupported3.b.getReadableDatabase().query(true, "Events", new String[]{"id", "visitor_id", "session_id", "sequence_nr", "basic_segment", "event_segment", "event_id", "session_start", "event_start", "multiplicity", "server_id", "app_id", "sr_param"}, "id >= 0", null, null, null, "visitor_id ASC, session_id ASC, sequence_nr ASC, server_id ASC, id ASC", null);
            if (cursorQuery == null) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    String str3 = isEffectTargetsSupported.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("null cursor for fetchEvents");
                }
            } else {
                if (cursorQuery.moveToFirst()) {
                    int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("id");
                    int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("visitor_id");
                    int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("session_id");
                    int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("sequence_nr");
                    int columnIndexOrThrow5 = cursorQuery.getColumnIndexOrThrow("basic_segment");
                    int columnIndexOrThrow6 = cursorQuery.getColumnIndexOrThrow("event_segment");
                    int columnIndexOrThrow7 = cursorQuery.getColumnIndexOrThrow("event_id");
                    int columnIndexOrThrow8 = cursorQuery.getColumnIndexOrThrow("session_start");
                    cursorQuery.getColumnIndexOrThrow("event_start");
                    int columnIndexOrThrow9 = cursorQuery.getColumnIndexOrThrow("multiplicity");
                    int columnIndexOrThrow10 = cursorQuery.getColumnIndexOrThrow("server_id");
                    int columnIndexOrThrow11 = cursorQuery.getColumnIndexOrThrow("sr_param");
                    ArrayList arrayList = new ArrayList();
                    long j6 = -1;
                    int i4 = 0;
                    int i5 = 0;
                    int length = 0;
                    long j7 = 0;
                    long j8 = 0;
                    String str4 = null;
                    while (true) {
                        try {
                            long j9 = cursorQuery.getLong(columnIndexOrThrow2);
                            long j10 = cursorQuery.getLong(columnIndexOrThrow3);
                            int i6 = cursorQuery.getInt(columnIndexOrThrow4);
                            int i7 = columnIndexOrThrow2;
                            String string = cursorQuery.getString(columnIndexOrThrow6);
                            cursorQuery.getInt(columnIndexOrThrow7);
                            int i8 = columnIndexOrThrow3;
                            int i9 = cursorQuery.getInt(columnIndexOrThrow10);
                            if (str4 == null) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(cursorQuery.getString(columnIndexOrThrow5));
                                sb4.append(lambdasetTransformationInfoListener8.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(cursorQuery.getLong(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11)));
                                String string2 = sb4.toString();
                                arrayList.add(string);
                                int length2 = string2.length();
                                str4 = string2;
                                i4 = i6;
                                i5 = i9;
                                length = length2 + 1 + string.length();
                                j6 = cursorQuery.getLong(columnIndexOrThrow);
                                j8 = j9;
                                j7 = j10;
                            } else {
                                columnIndexOrThrow6 = columnIndexOrThrow6;
                                int length3 = length + 1 + string.length();
                                if (j8 != j9 || j7 != j10 || i4 != i6 || i5 != i9 || length3 > j5) {
                                    i = i4;
                                    i2 = i5;
                                    str = str4;
                                    j2 = j8;
                                    j3 = j7;
                                    j4 = j6;
                                    z = false;
                                    break;
                                }
                                arrayList.add(string);
                                j6 = cursorQuery.getLong(columnIndexOrThrow);
                                length = length3;
                            }
                            if (!cursorQuery.moveToNext()) {
                                i = i4;
                                i2 = i5;
                                str = str4;
                                j2 = j8;
                                j3 = j7;
                                j4 = j6;
                                z = true;
                                break;
                            }
                            columnIndexOrThrow2 = i7;
                            columnIndexOrThrow3 = i8;
                            columnIndexOrThrow4 = columnIndexOrThrow4;
                            columnIndexOrThrow5 = columnIndexOrThrow5;
                            columnIndexOrThrow6 = columnIndexOrThrow6;
                        } catch (Throwable th) {
                            th = th;
                            communicationManager = this;
                            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                StringBuilder sb5 = new StringBuilder("sendMonitoringData end @");
                                sb5.append(communicationManager.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime());
                                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb5.toString());
                            }
                            tuitionPaymentFragmentspecialinlinedviewModeldefault3 = communicationManager.INotificationSideChannelDefault;
                            file = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
                            if (file != null) {
                                file.delete();
                                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 = null;
                            }
                            throw th;
                        }
                    }
                    cursorQuery.close();
                    ismirroringrequired = new isMirroringRequired(j2, j3, i, i2, j4, new SurfaceRequest1(str, arrayList), z);
                    if (ismirroringrequired == null) {
                        sendState = SendState.NO_DATA;
                        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            sb2 = new StringBuilder("sendMonitoringData end @");
                            sb = sb2;
                            communicationManager = this;
                            sb.append(communicationManager.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime());
                            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
                        } else {
                            communicationManager = this;
                        }
                    } else {
                        z2 = ismirroringrequired.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (ismirroringrequired.g == j) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(serverConfiguration, ismirroringrequired.b, ismirroringrequired.TuitionPaymentFragmentspecialinlinedviewModeldefault2, z3, ismirroringrequired.g, ismirroringrequired.asBinder, !z2)) {
                            communicationManager = this;
                            try {
                                iseffecttargetssupported = communicationManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                synchronized (iseffecttargetssupported) {
                                    try {
                                        iDelete = iseffecttargetssupported.b.getWritableDatabase().delete("Events", "visitor_id= ? AND session_id= ? AND sequence_nr= ? AND server_id= ? AND id<= ?", new String[]{String.valueOf(ismirroringrequired.g), String.valueOf(ismirroringrequired.asBinder), String.valueOf(ismirroringrequired.TuitionPaymentFragmentspecialinlinedviewModeldefault1), String.valueOf(ismirroringrequired.TuitionPaymentFragmentspecialinlinedviewModeldefault2), String.valueOf(ismirroringrequired.TuitionPaymentFragmentbindingInflater1)});
                                        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                            String str5 = notifyActive.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Rows removed: ".concat(String.valueOf(iDelete)));
                                        }
                                    } catch (Exception unused2) {
                                        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                            String str6 = isEffectTargetsSupported.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            ViewPort.TuitionPaymentFragmentbindingInflater1("Database error.");
                                        }
                                    }
                                }
                                if (ismirroringrequired.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                    sendState = SendState.FINISHED;
                                } else {
                                    sendState = SendState.MORE_DATA_AVAILABLE;
                                }
                                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                    sb = new StringBuilder("sendMonitoringData end @");
                                    sb.append(communicationManager.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime());
                                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                    StringBuilder sb6 = new StringBuilder("sendMonitoringData end @");
                                    sb6.append(communicationManager.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime());
                                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb6.toString());
                                }
                                tuitionPaymentFragmentspecialinlinedviewModeldefault3 = communicationManager.INotificationSideChannelDefault;
                                file = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
                                if (file != null) {
                                    file.delete();
                                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 = null;
                                }
                                throw th;
                            }
                        } else {
                            sendState = SendState.DATA_NOT_SENT;
                            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                sb2 = new StringBuilder("sendMonitoringData end @");
                                sb = sb2;
                                communicationManager = this;
                                sb.append(communicationManager.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime());
                                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
                            } else {
                                communicationManager = this;
                            }
                        }
                    }
                    tuitionPaymentFragmentspecialinlinedviewModeldefault4 = communicationManager.INotificationSideChannelDefault;
                    file2 = tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentbindingInflater1;
                    if (file2 != null) {
                        file2.delete();
                        tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentbindingInflater1 = null;
                    }
                    return sendState;
                }
                cursorQuery.close();
            }
            ismirroringrequired = null;
            if (ismirroringrequired == null) {
                sendState = SendState.NO_DATA;
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    sb2 = new StringBuilder("sendMonitoringData end @");
                    sb = sb2;
                    communicationManager = this;
                    sb.append(communicationManager.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime());
                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
                } else {
                    communicationManager = this;
                }
            } else {
                z2 = ismirroringrequired.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (ismirroringrequired.g == j) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(serverConfiguration, ismirroringrequired.b, ismirroringrequired.TuitionPaymentFragmentspecialinlinedviewModeldefault2, z3, ismirroringrequired.g, ismirroringrequired.asBinder, !z2)) {
                    sendState = SendState.DATA_NOT_SENT;
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        sb2 = new StringBuilder("sendMonitoringData end @");
                        sb = sb2;
                        communicationManager = this;
                        sb.append(communicationManager.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime());
                        ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
                    } else {
                        communicationManager = this;
                    }
                } else {
                    communicationManager = this;
                    iseffecttargetssupported = communicationManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    synchronized (iseffecttargetssupported) {
                        iDelete = iseffecttargetssupported.b.getWritableDatabase().delete("Events", "visitor_id= ? AND session_id= ? AND sequence_nr= ? AND server_id= ? AND id<= ?", new String[]{String.valueOf(ismirroringrequired.g), String.valueOf(ismirroringrequired.asBinder), String.valueOf(ismirroringrequired.TuitionPaymentFragmentspecialinlinedviewModeldefault1), String.valueOf(ismirroringrequired.TuitionPaymentFragmentspecialinlinedviewModeldefault2), String.valueOf(ismirroringrequired.TuitionPaymentFragmentbindingInflater1)});
                        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            String str7 = notifyActive.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Rows removed: ".concat(String.valueOf(iDelete)));
                            if (ismirroringrequired.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                sendState = SendState.FINISHED;
                            } else {
                                sendState = SendState.MORE_DATA_AVAILABLE;
                            }
                            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                sb = new StringBuilder("sendMonitoringData end @");
                                sb.append(communicationManager.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime());
                                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
                            }
                        } else {
                            if (ismirroringrequired.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                sendState = SendState.FINISHED;
                            } else {
                                sendState = SendState.MORE_DATA_AVAILABLE;
                            }
                            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                sb = new StringBuilder("sendMonitoringData end @");
                                sb.append(communicationManager.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime());
                                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
                            }
                        }
                    }
                }
            }
            tuitionPaymentFragmentspecialinlinedviewModeldefault4 = communicationManager.INotificationSideChannelDefault;
            file2 = tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentbindingInflater1;
            if (file2 != null) {
                file2.delete();
                tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentbindingInflater1 = null;
            }
            return sendState;
        } catch (Throwable th3) {
            th = th3;
            communicationManager = this;
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                StringBuilder sb7 = new StringBuilder("sendMonitoringData end @");
                sb7.append(communicationManager.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime());
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb7.toString());
            }
            tuitionPaymentFragmentspecialinlinedviewModeldefault3 = communicationManager.INotificationSideChannelDefault;
            file = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
            if (file != null) {
                file.delete();
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 = null;
            }
            throw th;
        }
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(ServerConfiguration serverConfiguration, SurfaceRequest1 surfaceRequest1, int i, boolean z, long j, long j2, boolean z2) {
        boolean zTuitionPaymentFragmentbindingInflater1;
        try {
            if (lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().asInterface.get() || lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().f1258a.get() || !z) {
                zTuitionPaymentFragmentbindingInflater1 = false;
            } else {
                zTuitionPaymentFragmentbindingInflater1 = lambdasetTransformationInfoListener8.TuitionPaymentFragmentbindingInflater1(surfaceRequest1);
                if (zTuitionPaymentFragmentbindingInflater1) {
                    try {
                        lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().f1258a.set(true);
                    } catch (Exception e2) {
                        e = e2;
                        if (zTuitionPaymentFragmentbindingInflater1) {
                            lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().f1258a.set(false);
                        }
                        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            if (e instanceof UnknownHostException) {
                                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("data request failed");
                                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e.toString());
                            } else {
                                ViewPort.TuitionPaymentFragmentbindingInflater1("data request failed");
                            }
                        }
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2(e);
                        return false;
                    }
                }
            }
            SurfaceRequest5 surfaceRequest5 = this.onTransact;
            StringBuilder sb = new StringBuilder(surfaceRequest1.TuitionPaymentFragmentbindingInflater1);
            for (String str : surfaceRequest1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                sb.append("&");
                sb.append(str);
            }
            ServerConfiguration serverConfigurationTuitionPaymentFragmentspecialinlinedviewModeldefault1 = surfaceRequest5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(serverConfiguration, false, sb.toString(), i, j, j2, z2);
            if (zTuitionPaymentFragmentbindingInflater1) {
                lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(true);
                lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().f1258a.set(false);
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(serverConfigurationTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            return true;
        } catch (Exception e3) {
            e = e3;
            zTuitionPaymentFragmentbindingInflater1 = false;
        }
    }

    private void b(ServerConfiguration serverConfiguration, mergeConfigs mergeconfigs) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime(), serverConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > 0);
        try {
            boolean z = mergeconfigs.f1275a.configurationApplied;
            ServerConfiguration serverConfigurationTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.onTransact.TuitionPaymentFragmentspecialinlinedviewModeldefault1(serverConfiguration, !z, null, lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().notify, mergeconfigs.cancelAll, mergeconfigs.d, false);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(serverConfigurationTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            if (!z) {
                mergeconfigs.TuitionPaymentFragmentbindingInflater1(serverConfigurationTuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentbindingInflater1);
                if (!mergeconfigs.f1275a.active) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mergeconfigs.cancelAll, mergeconfigs.d);
                } else {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1(mergeconfigs);
                }
                getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mergeconfigs);
            }
            if (mergeConfigs.TuitionPaymentFragmentbindingInflater1().f1275a.configurationApplied) {
                this.d.set(false);
            }
        } catch (Exception e2) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                if (e2 instanceof UnknownHostException) {
                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("beacon request failed");
                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2.toString());
                } else {
                    ViewPort.TuitionPaymentFragmentbindingInflater1("beacon request failed");
                }
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
        }
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("UEM state update: UEM state: %b mForceUemUpdate: %b", Boolean.valueOf(this.asInterface.get()), Boolean.valueOf(this.d.get())));
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ServerConfiguration serverConfiguration) {
        clearTransformationInfoListener cleartransformationinfolistener;
        synchronized (this) {
            ServerConfiguration serverConfiguration2 = lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().onTransact;
            if (serverConfiguration.cancelAll >= serverConfiguration2.cancelAll) {
                this.asInterface.set(serverConfiguration.b == 1);
                if (serverConfiguration.cancel == ServerConfiguration.Status.ERROR) {
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Received faulty settings that will turn the agent off");
                    }
                } else {
                    removeStateChangeCallback removestatechangecallback = lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().asBinder;
                    SharedPreferences.Editor editorEdit = removestatechangecallback.b.edit();
                    try {
                        snapToSurfaceRotation snaptosurfacerotation = removestatechangecallback.TuitionPaymentFragmentbindingInflater1;
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("maxBeaconSizeKb", serverConfiguration.TuitionPaymentFragmentbindingInflater1);
                        jSONObject2.put("selfmonitoring", serverConfiguration.asBinder);
                        getAppTargetRotation getapptargetrotation = serverConfiguration.onTransact;
                        jSONObject2.put("maxSessionDurationMins", getapptargetrotation.TuitionPaymentFragmentbindingInflater1);
                        jSONObject2.put("sessionTimeoutSec", getapptargetrotation.b);
                        jSONObject2.put("sendIntervalSec", serverConfiguration.f762a);
                        jSONObject2.put("maxCachedCrashesCount", serverConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        jSONObject2.put("rageTapConfig", snapToSurfaceRotation.TuitionPaymentFragmentbindingInflater1(serverConfiguration));
                        jSONObject2.put("replayConfig", snapToSurfaceRotation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(serverConfiguration));
                        jSONObject.put("mobileAgentConfig", jSONObject2);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("replayConfig", snapToSurfaceRotation.b(serverConfiguration));
                        jSONObject3.put("bp4Enabled", serverConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        jSONObject.put("appConfig", jSONObject3);
                        jSONObject.put("dynamicConfig", snapToSurfaceRotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1(serverConfiguration));
                        jSONObject.put("timestamp", 0L);
                        editorEdit.putString("ServerConfig", jSONObject.toString());
                    } catch (JSONException unused) {
                        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            String str = removeStateChangeCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            ViewPort.TuitionPaymentFragmentbindingInflater1("unable to generate configuration");
                        }
                        editorEdit.remove("ServerConfig");
                    }
                    editorEdit.apply();
                }
                getDeferrableSurface.b(serverConfiguration);
                if (this.TuitionPaymentFragmentbindingInflater1 != null) {
                    long j = serverConfiguration.cancelAll;
                    long j2 = serverConfiguration2.cancelAll;
                    if (serverConfiguration.INotificationSideChannel) {
                        int i = serverConfiguration.d;
                    }
                }
                if (this.INotificationSideChannelStubProxy != null && (cleartransformationinfolistener = this.INotificationSideChannel) != null) {
                    cleartransformationinfolistener.TuitionPaymentFragmentbindingInflater1(true, false);
                }
            }
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Exception exc) {
        clearTransformationInfoListener cleartransformationinfolistener;
        clearTransformationInfoListener cleartransformationinfolistener2;
        clearTransformationInfoListener cleartransformationinfolistener3;
        List<String> list;
        boolean z = exc instanceof InvalidResponseException;
        if (z) {
            SurfaceRequestExternalSyntheticLambda7 surfaceRequestExternalSyntheticLambda7 = ((InvalidResponseException) exc).response;
            if (surfaceRequestExternalSyntheticLambda7.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == 429 && (list = surfaceRequestExternalSyntheticLambda7.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get("Retry-After")) != null && !list.isEmpty()) {
                try {
                    int i = Integer.parseInt(list.get(0));
                    this.asInterface.set(false);
                    notifyInactive.TuitionPaymentFragmentspecialinlinedviewModeldefault1().b();
                    getDeferrableSurface.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    clearTransformationInfoListener cleartransformationinfolistener4 = this.INotificationSideChannel;
                    if (cleartransformationinfolistener4 != null) {
                        cleartransformationinfolistener4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
                        return;
                    }
                } catch (NumberFormatException unused) {
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        ViewPort.a("can't parse Retry-After header");
                    }
                }
            }
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            if (z) {
                this.asInterface.set(false);
                if (this.INotificationSideChannelStubProxy != null && (cleartransformationinfolistener2 = this.INotificationSideChannel) != null) {
                    cleartransformationinfolistener2.TuitionPaymentFragmentbindingInflater1();
                }
            } else {
                this.asInterface.set(false);
                if (this.INotificationSideChannelStubProxy != null && (cleartransformationinfolistener = this.INotificationSideChannel) != null) {
                    cleartransformationinfolistener.TuitionPaymentFragmentbindingInflater1(false, true);
                }
            }
            if (this.asBinder.isShutdown()) {
                return;
            }
            this.asBinder.execute(new SurfaceRequestExternalSyntheticLambda8(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, exc));
            return;
        }
        this.asInterface.set(false);
        if (this.INotificationSideChannelStubProxy == null || (cleartransformationinfolistener3 = this.INotificationSideChannel) == null) {
            return;
        }
        cleartransformationinfolistener3.TuitionPaymentFragmentbindingInflater1(false, false);
    }

    /* JADX INFO: renamed from: com.dynatrace.android.agent.CommunicationManager$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] TuitionPaymentFragmentbindingInflater1;

        static {
            int[] iArr = new int[SendState.values().length];
            TuitionPaymentFragmentbindingInflater1 = iArr;
            try {
                iArr[SendState.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[SendState.MORE_DATA_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[SendState.DATA_NOT_SENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[SendState.NO_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ServerConfiguration serverConfiguration) {
        mergeConfigs mergeconfigsTuitionPaymentFragmentbindingInflater1 = mergeConfigs.TuitionPaymentFragmentbindingInflater1();
        if (mergeconfigsTuitionPaymentFragmentbindingInflater1.f1275a.configurationApplied) {
            this.d.set(false);
        } else if (this.d.get()) {
            b(serverConfiguration, mergeconfigsTuitionPaymentFragmentbindingInflater1);
        }
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(isServiced isserviced, int i, mergeConfigs mergeconfigs) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(isserviced.b().toString());
        long j = mergeconfigs.g;
        int i2 = mergeconfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str = mergeconfigs.asInterface;
        String strTuitionPaymentFragmentbindingInflater1 = lambdasetTransformationInfoListener8.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(j, i2, null);
        StringBuilder sb = new StringBuilder();
        sb.append(getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(isserviced.cancel));
        sb.append(strTuitionPaymentFragmentbindingInflater1);
        SurfaceRequest1 surfaceRequest1 = new SurfaceRequest1(sb.toString(), arrayList);
        boolean z = Thread.currentThread() == Looper.getMainLooper().getThread();
        boolean z2 = isserviced.a() == 0;
        ServerConfiguration serverConfiguration = lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().onTransact;
        if (z) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, serverConfiguration, surfaceRequest1, i, z2, mergeconfigs.cancelAll, mergeconfigs.d, (byte) 0);
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.start();
            try {
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.join(5000L);
            } catch (InterruptedException unused) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.a("crash reporting thread problem");
                }
            }
            return tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1;
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(serverConfiguration, surfaceRequest1, i, z2, mergeconfigs.cancelAll, mergeconfigs.d, false);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(mergeConfigs mergeconfigs) {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("updateSessionPropertiesForEvents");
        }
        notifyInactive.TuitionPaymentFragmentspecialinlinedviewModeldefault1().b();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mergeconfigs);
    }

    /* JADX INFO: loaded from: classes4.dex */
    public class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends Thread {
        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(CommunicationManager communicationManager, byte b) {
            this();
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            StringBuilder sb = new StringBuilder();
            sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            sb.append("EventSenderThread");
            super(sb.toString());
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            boolean z;
            CommunicationManager.g(CommunicationManager.this);
            do {
                try {
                    synchronized (this) {
                        try {
                            if (!CommunicationManager.this.f759a) {
                                return;
                            }
                            wait();
                            z = CommunicationManager.this.f759a;
                            CommunicationManager communicationManager = CommunicationManager.this;
                            NetworkInfo networkInfoTuitionPaymentFragmentspecialinlinedviewModeldefault1 = addUseCase.b().TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            boolean z2 = networkInfoTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && (networkInfoTuitionPaymentFragmentspecialinlinedviewModeldefault1.isAvailable() || networkInfoTuitionPaymentFragmentspecialinlinedviewModeldefault1.isConnected());
                            if (!z2 && SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                String str = addUseCase.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                ViewPort.g("Network connection is not available");
                            }
                            CommunicationManager.b(communicationManager, z2);
                        } catch (Throwable th) {
                            throw th;
                        }
                        return;
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e2) {
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        String unused2 = CommunicationManager.b;
                        ViewPort.TuitionPaymentFragmentbindingInflater1(e2.getMessage());
                        return;
                    }
                    return;
                }
            } while (z);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    class TuitionPaymentFragmentbindingInflater1 extends TimerTask {
        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            if (CommunicationManager.this.INotificationSideChannel != null) {
                if (CommunicationManager.this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault2() || CommunicationManager.this.asInterface.get()) {
                    long jElapsedRealtime = (CommunicationManager.this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime()) - CommunicationManager.this.getInterfaceDescriptor;
                    clearTransformationInfoListener cleartransformationinfolistener = CommunicationManager.this.INotificationSideChannel;
                    boolean z = false;
                    if (cleartransformationinfolistener.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && !cleartransformationinfolistener.TuitionPaymentFragmentbindingInflater1 && cleartransformationinfolistener.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 0) {
                        CommunicationManager.this.d.set(CommunicationManager.this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAndSet(false));
                        if (!CommunicationManager.this.d.get()) {
                            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                String unused = CommunicationManager.b;
                                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("ReconnWait: mUemActive=%b lastCheck=%ds ago", Boolean.valueOf(CommunicationManager.this.asInterface.get()), Long.valueOf(jElapsedRealtime / 1000)));
                                return;
                            }
                            return;
                        }
                    }
                    if (jElapsedRealtime >= 7200000) {
                        CommunicationManager.this.d.set(true);
                    }
                    if (!CommunicationManager.this.d.get()) {
                        AtomicBoolean atomicBoolean = CommunicationManager.this.d;
                        if (CommunicationManager.this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAndSet(false) && mergeConfigs.TuitionPaymentFragmentbindingInflater1().f1275a.active) {
                            z = true;
                        }
                        atomicBoolean.set(z);
                    }
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        String unused2 = CommunicationManager.b;
                        ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("TaskTimer mForceUemUpdate=%b mUemActive=%b", Boolean.valueOf(CommunicationManager.this.d.get()), Boolean.valueOf(CommunicationManager.this.asInterface.get())));
                    }
                    if (CommunicationManager.this.asInterface.get() || CommunicationManager.this.d.get()) {
                        if (CommunicationManager.this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                            CommunicationManager.this.g.set(true);
                        }
                        if (isServiced.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get() == 1) {
                            CommunicationManager.this.g.set(true);
                            isServiced.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(2);
                        }
                        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            String unused3 = CommunicationManager.b;
                            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("TaskTimer mForceSendEvent=%s thread ID=%d", Boolean.valueOf(CommunicationManager.this.g.get()), Long.valueOf(CommunicationManager.this.cancelAll.getId())));
                        }
                        if (CommunicationManager.this.g.get() || CommunicationManager.this.d.get()) {
                            synchronized (CommunicationManager.this.cancelAll) {
                                CommunicationManager.this.cancelAll.notify();
                            }
                            CommunicationManager communicationManager = CommunicationManager.this;
                            communicationManager.getInterfaceDescriptor = communicationManager.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime();
                            return;
                        }
                        return;
                    }
                    return;
                }
                CommunicationManager.this.b();
                getDeferrableSurface.b(99L);
                CommunicationManager.asBinder(CommunicationManager.this);
                return;
            }
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                String unused4 = CommunicationManager.b;
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("invalid DataSendTimerTask appeared");
            }
            CommunicationManager.this.b();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends Thread {
        boolean TuitionPaymentFragmentbindingInflater1;
        private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final SurfaceRequest1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f760a;
        private final long asInterface;
        private final ServerConfiguration b;

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1(CommunicationManager communicationManager, ServerConfiguration serverConfiguration, SurfaceRequest1 surfaceRequest1, int i, boolean z, long j, long j2, byte b) {
            this(serverConfiguration, surfaceRequest1, i, z, j, j2);
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault1(ServerConfiguration serverConfiguration, SurfaceRequest1 surfaceRequest1, int i, boolean z, long j, long j2) {
            this.TuitionPaymentFragmentbindingInflater1 = false;
            setName("POST CrashReport");
            this.b = serverConfiguration;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = surfaceRequest1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
            this.f760a = j;
            this.asInterface = j2;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            this.TuitionPaymentFragmentbindingInflater1 = CommunicationManager.TuitionPaymentFragmentbindingInflater1(CommunicationManager.this, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.f760a, this.asInterface);
        }
    }

    protected class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        File TuitionPaymentFragmentbindingInflater1;

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(CommunicationManager communicationManager, byte b) {
            this();
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        public final boolean b() {
            boolean z = false;
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().g.getCacheDir());
                sb.append(File.separator);
                sb.append("Write.lock");
                File file = new File(sb.toString());
                boolean zExists = file.exists();
                if (!zExists || (CommunicationManager.this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime()) - file.lastModified() <= 60000) {
                    z = zExists;
                } else {
                    file.delete();
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        String unused = CommunicationManager.b;
                        ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Force taking write lock");
                    }
                }
                if (!z) {
                    try {
                        if (file.createNewFile()) {
                            file.deleteOnExit();
                            this.TuitionPaymentFragmentbindingInflater1 = file;
                        } else {
                            z = true;
                        }
                    } catch (IOException e2) {
                        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            String unused2 = CommunicationManager.b;
                            ViewPort.asInterface(e2.toString());
                        }
                    }
                }
                return !z;
            } catch (Exception e3) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    String unused3 = CommunicationManager.b;
                    ViewPort.asInterface(e3.toString());
                }
                return false;
            }
        }
    }

    static /* synthetic */ void b(CommunicationManager communicationManager, boolean z) {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("EventSender active ... mForceSendEvent=%b mForceUemUpdate=%b", Boolean.valueOf(communicationManager.g.get()), Boolean.valueOf(communicationManager.d.get())));
        }
        ServerConfiguration serverConfiguration = lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().onTransact;
        if (!z) {
            communicationManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(communicationManager.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime(), serverConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > 0);
            return;
        }
        mergeConfigs mergeconfigsTuitionPaymentFragmentbindingInflater1 = mergeConfigs.TuitionPaymentFragmentbindingInflater1();
        if (mergeconfigsTuitionPaymentFragmentbindingInflater1.f1275a.configurationApplied && communicationManager.g.compareAndSet(true, false)) {
            int i = AnonymousClass5.TuitionPaymentFragmentbindingInflater1[communicationManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2(serverConfiguration, mergeconfigsTuitionPaymentFragmentbindingInflater1.cancelAll).ordinal()];
            if (i == 1) {
                communicationManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1(serverConfiguration);
                return;
            }
            if (i == 2) {
                communicationManager.g.set(true);
                communicationManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1(serverConfiguration);
                return;
            } else if (i == 3) {
                communicationManager.g.set(true);
                return;
            } else {
                if (i == 4 && communicationManager.d.get()) {
                    communicationManager.b(serverConfiguration, mergeconfigsTuitionPaymentFragmentbindingInflater1);
                    return;
                }
                return;
            }
        }
        if (communicationManager.d.get()) {
            communicationManager.b(serverConfiguration, mergeconfigsTuitionPaymentFragmentbindingInflater1);
        } else {
            if (mergeconfigsTuitionPaymentFragmentbindingInflater1.f1275a.configurationApplied || !communicationManager.g.get()) {
                return;
            }
            communicationManager.b(serverConfiguration, mergeconfigsTuitionPaymentFragmentbindingInflater1);
        }
    }
}
