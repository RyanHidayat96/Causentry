package com.appsflyer.internal;

import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1tSDK implements AFc1vSDK {
    private final AFc1iSDK AFAdRevenueData;
    private final AFc1qSDK getCurrencyIso4217Code;
    private final AFc1sSDK getMediationNetwork;
    private final Map<String, Integer> getRevenue;

    public AFc1tSDK(AFc1iSDK aFc1iSDK, AFc1qSDK aFc1qSDK) {
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        this.AFAdRevenueData = aFc1iSDK;
        this.getCurrencyIso4217Code = aFc1qSDK;
        this.getMediationNetwork = new AFc1sSDK(CollectionsKt.listOf((Object[]) new AFc1uSDK[]{new AFc1uSDK("ConversionsCache", CollectionsKt.listOf(AFe1mSDK.CONVERSION), 1), new AFc1uSDK("AttrCache", CollectionsKt.listOf(AFe1mSDK.ATTR), 1), new AFc1uSDK("OtherCache", CollectionsKt.listOf((Object[]) new AFe1mSDK[]{AFe1mSDK.LAUNCH, AFe1mSDK.INAPP, AFe1mSDK.ADREVENUE, AFe1mSDK.ARS_VALIDATE, AFe1mSDK.PURCHASE_VALIDATE, AFe1mSDK.MANUAL_PURCHASE_VALIDATION, AFe1mSDK.SDK_SERVICES}), 40)}));
        this.getRevenue = MapsKt.mutableMapOf(TuplesKt.to("ConversionsCache", 0), TuplesKt.to("AttrCache", 0), TuplesKt.to("OtherCache", 0));
    }

    private final void getMonetizationNetwork() {
        for (AFc1uSDK aFc1uSDK : this.getMediationNetwork.AFAdRevenueData) {
            String str = aFc1uSDK.getCurrencyIso4217Code;
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
            if (!file.exists()) {
                file.mkdirs();
                this.getRevenue.put(aFc1uSDK.getCurrencyIso4217Code, 0);
            } else {
                Map<String, Integer> map = this.getRevenue;
                String str2 = aFc1uSDK.getCurrencyIso4217Code;
                File[] fileArrListFiles = file.listFiles();
                map.put(str2, Integer.valueOf(fileArrListFiles != null ? fileArrListFiles.length : 0));
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final List<AFc1rSDK> getRevenue() {
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Get Cached Requests", false, 4, null);
        ArrayList arrayList = new ArrayList();
        ArrayList<File> arrayList2 = new ArrayList();
        try {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            }
            Iterator<T> it = this.getMediationNetwork.AFAdRevenueData.iterator();
            while (it.hasNext()) {
                String str = ((AFc1uSDK) it.next()).getCurrencyIso4217Code;
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context3);
                File file = new File(new File(context3.getFilesDir(), "AFRequestCache"), str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                CollectionsKt.addAll(arrayList2, fileArrListFiles);
            }
            for (File file2 : arrayList2) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
                String name = file2.getName();
                StringBuilder sb = new StringBuilder();
                sb.append("Found cached request: ");
                sb.append(name);
                AFg1gSDK.i$default(aFLogger, aFg1cSDK, sb.toString(), false, 4, null);
                AFc1rSDK mediationNetwork = getMediationNetwork(file2);
                if (mediationNetwork != null) {
                    arrayList.add(mediationNetwork);
                }
            }
        } catch (Exception e2) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not get cached requests", e2, false, false, false, false, 120, null);
        }
        AFLogger aFLogger2 = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK2 = AFg1cSDK.CACHE;
        int size = arrayList.size();
        StringBuilder sb2 = new StringBuilder("Found ");
        sb2.append(size);
        sb2.append(" Cached Requests");
        AFg1gSDK.i$default(aFLogger2, aFg1cSDK2, sb2.toString(), false, 4, null);
        return arrayList;
    }

    private static AFc1rSDK getMediationNetwork(File file) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                char[] cArr = new char[(int) file.length()];
                inputStreamReader.read(cArr);
                AFc1rSDK aFc1rSDK = new AFc1rSDK(cArr);
                aFc1rSDK.getMediationNetwork = file.getName();
                CloseableKt.closeFinally(inputStreamReader, null);
                return aFc1rSDK;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(inputStreamReader, th);
                    throw th2;
                }
            }
        } catch (Exception e2) {
            AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Error while loading request from cache", e2, false, false, true, false);
            return null;
        }
    }

    private final boolean getCurrencyIso4217Code(File file) {
        try {
            file.delete();
            getMonetizationNetwork();
            return true;
        } catch (Exception e2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
            String name = file.getName();
            StringBuilder sb = new StringBuilder("Could not delete ");
            sb.append(name);
            sb.append(" from cache");
            AFg1gSDK.e$default(aFLogger, aFg1cSDK, sb.toString(), e2, false, false, false, false, 120, null);
            return false;
        }
    }

    private final AFc1uSDK getCurrencyIso4217Code(AFe1mSDK aFe1mSDK) {
        Object next;
        Iterator<T> it = this.getMediationNetwork.AFAdRevenueData.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((AFc1uSDK) next).getRevenue.contains(aFe1mSDK)) {
                return (AFc1uSDK) next;
            }
        }
        next = null;
        return (AFc1uSDK) next;
    }

    private final String getMediationNetwork(AFe1mSDK aFe1mSDK) {
        String str;
        AFc1uSDK currencyIso4217Code = getCurrencyIso4217Code(aFe1mSDK);
        if (currencyIso4217Code == null || (str = currencyIso4217Code.getCurrencyIso4217Code) == null) {
            throw new UnsupportedOperationException("Cache do not support this type of events");
        }
        return str;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void AFAdRevenueData() {
        try {
            if (this.getCurrencyIso4217Code.AFAdRevenueData("AF_CACHE_VERSION", -1) != 1) {
                this.getCurrencyIso4217Code.getMediationNetwork("AF_CACHE_VERSION", 1);
                Context context = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context);
                if (new File(context.getFilesDir(), "AFRequestCache").exists()) {
                    Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context2);
                    FilesKt.deleteRecursively(new File(context2.getFilesDir(), "AFRequestCache"));
                    Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context3);
                    new File(context3.getFilesDir(), "AFRequestCache").mkdir();
                }
            } else {
                Context context4 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context4);
                if (!new File(context4.getFilesDir(), "AFRequestCache").exists()) {
                    Context context5 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context5);
                    new File(context5.getFilesDir(), "AFRequestCache").mkdir();
                }
            }
            getMonetizationNetwork();
        } catch (Exception e2) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not init cache", e2, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final String AFAdRevenueData(AFc1rSDK aFc1rSDK) {
        File file;
        String str;
        List listSortedWith;
        List<File> listTake;
        Intrinsics.checkNotNullParameter(aFc1rSDK, "");
        try {
            AFe1mSDK aFe1mSDK = aFc1rSDK.getMonetizationNetwork;
            Intrinsics.checkNotNullExpressionValue(aFe1mSDK, "");
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            File file2 = new File(new File(context.getFilesDir(), "AFRequestCache"), getMediationNetwork(aFe1mSDK));
            if (!file2.exists()) {
                file2.mkdirs();
            }
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
            String str2 = aFc1rSDK.getRevenue;
            StringBuilder sb = new StringBuilder("Caching request with URL: ");
            sb.append(str2);
            AFg1gSDK.i$default(aFLogger, aFg1cSDK, sb.toString(), false, 4, null);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            file = new File(file2, strValueOf);
            try {
                file.createNewFile();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file.getPath(), true), Charset.defaultCharset());
                try {
                    OutputStreamWriter outputStreamWriter2 = outputStreamWriter;
                    outputStreamWriter2.write("version=");
                    outputStreamWriter2.write(aFc1rSDK.AFAdRevenueData);
                    outputStreamWriter2.write(10);
                    outputStreamWriter2.write("url=");
                    outputStreamWriter2.write(aFc1rSDK.getRevenue);
                    outputStreamWriter2.write(10);
                    outputStreamWriter2.write("data=");
                    outputStreamWriter2.write(Base64.encodeToString(aFc1rSDK.getMediationNetwork(), 2));
                    outputStreamWriter2.write(10);
                    AFe1mSDK aFe1mSDK2 = aFc1rSDK.getMonetizationNetwork;
                    outputStreamWriter2.write("type=");
                    outputStreamWriter2.write(aFe1mSDK2.name());
                    outputStreamWriter2.write(10);
                    outputStreamWriter2.flush();
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(outputStreamWriter, null);
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK2 = AFg1cSDK.CACHE;
                    StringBuilder sb2 = new StringBuilder("Cache request: done, cacheKey: ");
                    sb2.append(strValueOf);
                    AFg1gSDK.i$default(aFLogger2, aFg1cSDK2, sb2.toString(), false, 4, null);
                    AFe1mSDK aFe1mSDK3 = aFc1rSDK.getMonetizationNetwork;
                    Intrinsics.checkNotNullExpressionValue(aFe1mSDK3, "");
                    AFc1uSDK currencyIso4217Code = getCurrencyIso4217Code(aFe1mSDK3);
                    Integer numValueOf = currencyIso4217Code != null ? Integer.valueOf(currencyIso4217Code.AFAdRevenueData) : null;
                    if (numValueOf == null) {
                        return strValueOf;
                    }
                    int iIntValue = numValueOf.intValue();
                    Map<String, Integer> map = this.getRevenue;
                    AFc1uSDK currencyIso4217Code2 = getCurrencyIso4217Code(aFe1mSDK3);
                    if (currencyIso4217Code2 != null && (str = currencyIso4217Code2.getCurrencyIso4217Code) != null) {
                        Integer num = map.get(str);
                        int iIntValue2 = num != null ? num.intValue() : 0;
                        if (iIntValue2 >= iIntValue) {
                            int i = (iIntValue2 + 1) - iIntValue;
                            AFLogger aFLogger3 = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK3 = AFg1cSDK.CACHE;
                            StringBuilder sb3 = new StringBuilder("Cache overflown for type ");
                            sb3.append(aFe1mSDK3);
                            sb3.append(", removing ");
                            sb3.append(i);
                            sb3.append(" item(s)");
                            AFg1gSDK.i$default(aFLogger3, aFg1cSDK3, sb3.toString(), false, 4, null);
                            Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                            Intrinsics.checkNotNull(context2);
                            File file3 = new File(new File(context2.getFilesDir(), "AFRequestCache"), getMediationNetwork(aFe1mSDK3));
                            if (!file3.exists()) {
                                file3.mkdirs();
                            }
                            File[] fileArrListFiles = file3.listFiles();
                            if (fileArrListFiles != null && (listSortedWith = ArraysKt.sortedWith(fileArrListFiles, new Comparator() { // from class: com.appsflyer.internal.AFc1tSDK.1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t, T t2) {
                                    return ComparisonsKt.compareValues(((File) t).getName(), ((File) t2).getName());
                                }
                            })) != null && (listTake = CollectionsKt.take(listSortedWith, i)) != null) {
                                for (File file4 : listTake) {
                                    file4.delete();
                                    AFLogger aFLogger4 = AFLogger.INSTANCE;
                                    AFg1cSDK aFg1cSDK4 = AFg1cSDK.CACHE;
                                    String name = file4.getName();
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Cache entry ");
                                    sb4.append(name);
                                    sb4.append(" removed");
                                    AFg1gSDK.i$default(aFLogger4, aFg1cSDK4, sb4.toString(), false, 4, null);
                                }
                            }
                        }
                        getMonetizationNetwork();
                        return strValueOf;
                    }
                    throw new UnsupportedOperationException("Cache do not support this type of events");
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(outputStreamWriter, th);
                        throw th2;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                if (file != null) {
                    file.delete();
                }
                AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not cache request", e, false, false, false, false, 120, null);
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            file = null;
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final boolean AFAdRevenueData(String str) {
        if (str == null) {
            return false;
        }
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        Intrinsics.checkNotNull(context);
        if (new File(context.getFilesDir(), "AFRequestCache").exists()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
            StringBuilder sb = new StringBuilder("Deleting ");
            sb.append(str);
            sb.append(" from cache");
            AFg1gSDK.i$default(aFLogger, aFg1cSDK, sb.toString(), false, 4, null);
            Iterator<T> it = this.getMediationNetwork.AFAdRevenueData.iterator();
            while (it.hasNext()) {
                String str2 = ((AFc1uSDK) it.next()).getCurrencyIso4217Code;
                Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context2);
                File file = new File(new File(new File(context2.getFilesDir(), "AFRequestCache"), str2), str);
                if (file.exists()) {
                    return getCurrencyIso4217Code(file);
                }
            }
            return true;
        }
        Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
        Intrinsics.checkNotNull(context3);
        new File(context3.getFilesDir(), "AFRequestCache").mkdir();
        return true;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void getMediationNetwork() {
        try {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                return;
            }
            Iterator<T> it = this.getMediationNetwork.AFAdRevenueData.iterator();
            while (it.hasNext()) {
                String str = ((AFc1uSDK) it.next()).getCurrencyIso4217Code;
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context3);
                File[] fileArrListFiles = new File(new File(context3.getFilesDir(), "AFRequestCache"), str).listFiles();
                if (fileArrListFiles != null) {
                    Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                    for (File file : fileArrListFiles) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
                        String name = file.getName();
                        StringBuilder sb = new StringBuilder();
                        sb.append("ClearCache : Found cached request ");
                        sb.append(name);
                        AFg1gSDK.i$default(aFLogger, aFg1cSDK, sb.toString(), false, 4, null);
                        AFLogger aFLogger2 = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK2 = AFg1cSDK.CACHE;
                        String name2 = file.getName();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Deleting ");
                        sb2.append(name2);
                        sb2.append(" from cache");
                        AFg1gSDK.i$default(aFLogger2, aFg1cSDK2, sb2.toString(), false, 4, null);
                        file.delete();
                    }
                }
            }
            Context context4 = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context4);
            FilesKt.deleteRecursively(new File(context4.getFilesDir(), "AFRequestCache"));
            getMonetizationNetwork();
        } catch (Exception e2) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not clearCache request", e2, false, false, false, false, 120, null);
        }
    }
}
