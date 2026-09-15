package com.google.firebase.sessions;

import android.content.Context;
import android.os.Process;
import defpackage.getExtraEncoderProfiles;
import defpackage.isSamsungJ6;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@getExtraEncoderProfiles
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010 \u001a\u00020\t8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\u00020!8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010(\u001a\u00020\t8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u001b\u0010,\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010."}, d2 = {"Lcom/google/firebase/sessions/ProcessDataManagerImpl;", "Lcom/google/firebase/sessions/ProcessDataManager;", "Landroid/content/Context;", "p0", "Lcom/google/firebase/sessions/UuidGenerator;", "p1", "<init>", "(Landroid/content/Context;Lcom/google/firebase/sessions/UuidGenerator;)V", "", "", "Lcom/google/firebase/sessions/ProcessData;", "", "isColdStart", "(Ljava/util/Map;)Z", "isMyProcessStale", "", "onSessionGenerated", "()V", "updateProcessDataMap", "(Ljava/util/Map;)Ljava/util/Map;", "", "Lcom/google/firebase/sessions/ProcessDetails;", "getAppProcessDetails", "()Ljava/util/List;", "isProcessStale", "(Lcom/google/firebase/sessions/ProcessDetails;Lcom/google/firebase/sessions/ProcessData;)Z", "appContext", "Landroid/content/Context;", "myProcessName$delegate", "Lkotlin/Lazy;", "getMyProcessName", "()Ljava/lang/String;", "myProcessName", "", "myPid", "I", "getMyPid", "()I", "myUuid$delegate", "getMyUuid", "myUuid", "myProcessDetails$delegate", "getMyProcessDetails", "()Lcom/google/firebase/sessions/ProcessDetails;", "myProcessDetails", "hasGeneratedSession", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessDataManagerImpl implements ProcessDataManager {
    private final Context appContext;
    private boolean hasGeneratedSession;
    private final int myPid;

    /* JADX INFO: renamed from: myProcessDetails$delegate, reason: from kotlin metadata */
    private final Lazy myProcessDetails;

    /* JADX INFO: renamed from: myProcessName$delegate, reason: from kotlin metadata */
    private final Lazy myProcessName;

    /* JADX INFO: renamed from: myUuid$delegate, reason: from kotlin metadata */
    private final Lazy myUuid;

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final Map<String, ProcessData> generateProcessDataMap() {
        return ProcessDataManager.DefaultImpls.generateProcessDataMap(this);
    }

    @isSamsungJ6
    public ProcessDataManagerImpl(Context context, final UuidGenerator uuidGenerator) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uuidGenerator, "");
        this.appContext = context;
        this.myProcessName = LazyKt.lazy(new Function0() { // from class: com.google.firebase.sessions.ProcessDataManagerImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProcessDataManagerImpl.myProcessName_delegate$lambda$0(this.f$0);
            }
        });
        this.myPid = Process.myPid();
        this.myUuid = LazyKt.lazy(new Function0() { // from class: com.google.firebase.sessions.ProcessDataManagerImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProcessDataManagerImpl.myUuid_delegate$lambda$1(uuidGenerator);
            }
        });
        this.myProcessDetails = LazyKt.lazy(new Function0() { // from class: com.google.firebase.sessions.ProcessDataManagerImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProcessDataManagerImpl.myProcessDetails_delegate$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String myProcessName_delegate$lambda$0(ProcessDataManagerImpl processDataManagerImpl) {
        return processDataManagerImpl.getMyProcessDetails().getProcessName();
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final String getMyProcessName() {
        return (String) this.myProcessName.getValue();
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final int getMyPid() {
        return this.myPid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String myUuid_delegate$lambda$1(UuidGenerator uuidGenerator) {
        String string = uuidGenerator.next().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final String getMyUuid() {
        return (String) this.myUuid.getValue();
    }

    private final ProcessDetails getMyProcessDetails() {
        return (ProcessDetails) this.myProcessDetails.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProcessDetails myProcessDetails_delegate$lambda$2(ProcessDataManagerImpl processDataManagerImpl) {
        return ProcessDetailsProvider.INSTANCE.getMyProcessDetails(processDataManagerImpl.appContext);
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final boolean isColdStart(Map<String, ProcessData> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.hasGeneratedSession) {
            return false;
        }
        List<ProcessDetails> appProcessDetails = getAppProcessDetails();
        ArrayList arrayList = new ArrayList();
        for (ProcessDetails processDetails : appProcessDetails) {
            ProcessData processData = p0.get(processDetails.getProcessName());
            Pair pair = processData != null ? new Pair(processDetails, processData) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        ArrayList<Pair> arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return true;
        }
        for (Pair pair2 : arrayList2) {
            if (!isProcessStale((ProcessDetails) pair2.component1(), (ProcessData) pair2.component2())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final boolean isMyProcessStale(Map<String, ProcessData> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ProcessData processData = p0.get(getMyProcessName());
        return (processData != null && processData.getPid() == getMyPid() && Intrinsics.areEqual(processData.getUuid(), getMyUuid())) ? false : true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final void onSessionGenerated() {
        this.hasGeneratedSession = true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final Map<String, ProcessData> updateProcessDataMap(Map<String, ProcessData> p0) {
        Map mutableMap;
        if (p0 != null && (mutableMap = MapsKt.toMutableMap(p0)) != null) {
            mutableMap.put(getMyProcessName(), new ProcessData(Process.myPid(), getMyUuid()));
            Map<String, ProcessData> map = MapsKt.toMap(mutableMap);
            if (map != null) {
                return map;
            }
        }
        return MapsKt.mapOf(TuplesKt.to(getMyProcessName(), new ProcessData(Process.myPid(), getMyUuid())));
    }

    private final List<ProcessDetails> getAppProcessDetails() {
        return ProcessDetailsProvider.INSTANCE.getAppProcessDetails(this.appContext);
    }

    private final boolean isProcessStale(ProcessDetails p0, ProcessData p1) {
        if (Intrinsics.areEqual(getMyProcessName(), p0.getProcessName())) {
            return (p0.getPid() == p1.getPid() && Intrinsics.areEqual(getMyUuid(), p1.getUuid())) ? false : true;
        }
        return p0.getPid() != p1.getPid();
    }
}
