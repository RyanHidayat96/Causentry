package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1bSDK implements AFc1aSDK {
    private final AFc1iSDK AFAdRevenueData;

    public AFc1bSDK(AFc1iSDK aFc1iSDK) {
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        this.AFAdRevenueData = aFc1iSDK;
    }

    private final File getRevenue() {
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final String AFAdRevenueData(Throwable th, String str) {
        String str2;
        File file;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            File revenue = getRevenue();
            str2 = null;
            if (revenue != null) {
                file = new File(revenue, "6.17.0");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    AFc1cSDK currencyIso4217Code = AFd1qSDK.getCurrencyIso4217Code(th, str);
                    String str3 = currencyIso4217Code.getMonetizationNetwork;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        AFc1cSDK.Companion companion = AFc1cSDK.INSTANCE;
                        AFc1cSDK revenue2 = AFc1cSDK.Companion.getRevenue(FilesKt.readText$default(file2, null, 1, null));
                        if (revenue2 != null) {
                            revenue2.getMediationNetwork++;
                            currencyIso4217Code = revenue2;
                        }
                    }
                    FilesKt.writeText$default(file2, currencyIso4217Code.AFAdRevenueData(), null, 2, null);
                    str2 = str3;
                } catch (Exception e2) {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK = AFg1cSDK.EXCEPTION_MANAGER;
                    String message = e2.getMessage();
                    StringBuilder sb = new StringBuilder("Could not cache exception\n ");
                    sb.append(message);
                    AFg1gSDK.v$default(aFLogger, aFg1cSDK, sb.toString(), false, 4, null);
                }
            }
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0085 A[Catch: all -> 0x008b, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x001a, B:24:0x0075, B:25:0x0078, B:21:0x0050, B:26:0x007b, B:28:0x0085, B:10:0x001c, B:12:0x0022, B:14:0x0032, B:16:0x0046, B:17:0x0049, B:18:0x004c), top: B:34:0x0001, inners: #1 }] */
    @Override // com.appsflyer.internal.AFc1aSDK
    public final List<AFc1cSDK> getMediationNetwork() {
        List<AFc1cSDK> listEmptyList;
        File[] fileArrListFiles;
        ArrayList arrayList;
        synchronized (this) {
            File revenue = getRevenue();
            listEmptyList = null;
            if (revenue != null && (fileArrListFiles = revenue.listFiles()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (File file : fileArrListFiles) {
                    try {
                        File[] fileArrListFiles2 = file.listFiles();
                        if (fileArrListFiles2 != null) {
                            Intrinsics.checkNotNullExpressionValue(fileArrListFiles2, "");
                            ArrayList arrayList3 = new ArrayList();
                            for (File file2 : fileArrListFiles2) {
                                AFc1cSDK.Companion companion = AFc1cSDK.INSTANCE;
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                AFc1cSDK revenue2 = AFc1cSDK.Companion.getRevenue(FilesKt.readText$default(file2, null, 1, null));
                                if (revenue2 != null) {
                                    arrayList3.add(revenue2);
                                }
                            }
                            arrayList = arrayList3;
                        } else {
                            arrayList = null;
                        }
                    } catch (Throwable th) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.EXCEPTION_MANAGER;
                        String message = th.getMessage();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Could not get stored exceptions\n ");
                        sb.append(message);
                        AFg1gSDK.v$default(aFLogger, aFg1cSDK, sb.toString(), false, 4, null);
                    }
                    if (arrayList != null) {
                        arrayList2.add(arrayList);
                    }
                }
                listEmptyList = CollectionsKt.flatten(arrayList2);
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
            } else if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            throw th;
        }
        return listEmptyList;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final int getCurrencyIso4217Code() {
        Iterator<T> it = getMediationNetwork().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((AFc1cSDK) it.next()).getMediationNetwork;
        }
        return i;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final boolean getMonetizationNetwork() {
        return getRevenue(new String[0]);
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final boolean getRevenue(String... strArr) {
        boolean zDeleteRecursively;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            File revenue = getRevenue();
            zDeleteRecursively = true;
            if (revenue != null) {
                if (strArr.length == 0) {
                    AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                    zDeleteRecursively = FilesKt.deleteRecursively(revenue);
                } else {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK = AFg1cSDK.EXCEPTION_MANAGER;
                    String strJoinToString$default = ArraysKt.joinToString$default(strArr, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                    StringBuilder sb = new StringBuilder("delete all exceptions except for: ");
                    sb.append(strJoinToString$default);
                    AFg1gSDK.v$default(aFLogger, aFg1cSDK, sb.toString(), false, 4, null);
                    File[] fileArrListFiles = revenue.listFiles();
                    if (fileArrListFiles != null) {
                        Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                        ArrayList arrayList = new ArrayList();
                        for (File file : fileArrListFiles) {
                            if (!ArraysKt.contains(strArr, file.getName())) {
                                arrayList.add(file);
                            }
                        }
                        ArrayList<File> arrayList2 = arrayList;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                        for (File file2 : arrayList2) {
                            Intrinsics.checkNotNullExpressionValue(file2, "");
                            arrayList3.add(Boolean.valueOf(FilesKt.deleteRecursively(file2)));
                        }
                        Set set = CollectionsKt.toSet(arrayList3);
                        if (set.isEmpty()) {
                            set = SetsKt.setOf(Boolean.TRUE);
                        }
                        Set set2 = set;
                        if (set2.size() != 1 || !((Boolean) CollectionsKt.first(set2)).booleanValue()) {
                            zDeleteRecursively = false;
                        }
                    }
                }
            }
        }
        return zDeleteRecursively;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final void AFAdRevenueData(int i, int i2) {
        File[] fileArrListFiles;
        synchronized (this) {
            File revenue = getRevenue();
            if (revenue != null && (fileArrListFiles = revenue.listFiles()) != null) {
                Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                    int monetizationNetwork = AFj1aSDK.getMonetizationNetwork(name);
                    if (i > monetizationNetwork || monetizationNetwork > i2) {
                        arrayList.add(file);
                    }
                }
                ArrayList<File> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (File file2 : arrayList2) {
                    Intrinsics.checkNotNullExpressionValue(file2, "");
                    arrayList3.add(Boolean.valueOf(FilesKt.deleteRecursively(file2)));
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
