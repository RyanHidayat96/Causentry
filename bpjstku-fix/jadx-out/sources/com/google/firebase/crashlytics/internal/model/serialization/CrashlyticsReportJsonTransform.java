package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.Base64;
import android.util.JsonReader;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CrashlyticsReportJsonTransform {
    private static final DataEncoder CRASHLYTICS_REPORT_JSON_ENCODER = new JsonDataEncoderBuilder().configureWith(AutoCrashlyticsReportEncoder.CONFIG).ignoreNullValues(true).build();

    interface ObjectParser<T> {
        T parse(JsonReader jsonReader) throws IOException;
    }

    public String reportToJson(CrashlyticsReport crashlyticsReport) {
        return CRASHLYTICS_REPORT_JSON_ENCODER.encode(crashlyticsReport);
    }

    public String eventToJson(CrashlyticsReport.Session.Event event) {
        return CRASHLYTICS_REPORT_JSON_ENCODER.encode(event);
    }

    public String applicationExitInfoToJson(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return CRASHLYTICS_REPORT_JSON_ENCODER.encode(applicationExitInfo);
    }

    public CrashlyticsReport reportFromJson(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                CrashlyticsReport report = parseReport(jsonReader);
                jsonReader.close();
                return report;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e2) {
            throw new IOException(e2);
        }
    }

    public CrashlyticsReport.Session.Event eventFromJson(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                CrashlyticsReport.Session.Event event = parseEvent(jsonReader);
                jsonReader.close();
                return event;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e2) {
            throw new IOException(e2);
        }
    }

    public CrashlyticsReport.ApplicationExitInfo applicationExitInfoFromJson(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                CrashlyticsReport.ApplicationExitInfo appExitInfo = parseAppExitInfo(jsonReader);
                jsonReader.close();
                return appExitInfo;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e2) {
            throw new IOException(e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    private static CrashlyticsReport parseReport(JsonReader jsonReader) throws IOException {
        byte b;
        CrashlyticsReport.Builder builder = CrashlyticsReport.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName.hashCode()) {
                case -2118372775:
                    if (!strNextName.equals("ndkPayload")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -1962630338:
                    if (!strNextName.equals(RemoteConfigConstants.RequestFieldKey.SDK_VERSION)) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case -1907185581:
                    if (!strNextName.equals("appQualitySessionId")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case -1375141843:
                    if (!strNextName.equals("appExitInfo")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case -911706486:
                    if (!strNextName.equals("buildVersion")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case -401988390:
                    if (!strNextName.equals("firebaseAuthenticationToken")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 344431858:
                    if (!strNextName.equals("gmpAppId")) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case 719853845:
                    if (!strNextName.equals("installationUuid")) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 1047652060:
                    if (!strNextName.equals("firebaseInstallationId")) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case 1874684019:
                    if (!strNextName.equals("platform")) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case 1975623094:
                    if (!strNextName.equals("displayVersion")) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                case 1984987798:
                    if (!strNextName.equals("session")) {
                        b = -1;
                    } else {
                        b = 11;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    builder.setNdkPayload(parseNdkPayload(jsonReader));
                    break;
                case 1:
                    builder.setSdkVersion(jsonReader.nextString());
                    break;
                case 2:
                    builder.setAppQualitySessionId(jsonReader.nextString());
                    break;
                case 3:
                    builder.setAppExitInfo(parseAppExitInfo(jsonReader));
                    break;
                case 4:
                    builder.setBuildVersion(jsonReader.nextString());
                    break;
                case 5:
                    builder.setFirebaseAuthenticationToken(jsonReader.nextString());
                    break;
                case 6:
                    builder.setGmpAppId(jsonReader.nextString());
                    break;
                case 7:
                    builder.setInstallationUuid(jsonReader.nextString());
                    break;
                case 8:
                    builder.setFirebaseInstallationId(jsonReader.nextString());
                    break;
                case 9:
                    builder.setPlatform(jsonReader.nextInt());
                    break;
                case 10:
                    builder.setDisplayVersion(jsonReader.nextString());
                    break;
                case 11:
                    builder.setSession(parseSession(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    private static CrashlyticsReport.Session parseSession(JsonReader jsonReader) throws IOException {
        byte b;
        CrashlyticsReport.Session.Builder builder = CrashlyticsReport.Session.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName.hashCode()) {
                case -2128794476:
                    if (!strNextName.equals("startedAt")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -1907185581:
                    if (!strNextName.equals("appQualitySessionId")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case -1618432855:
                    if (!strNextName.equals("identifier")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case -1606742899:
                    if (!strNextName.equals("endedAt")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case -1335157162:
                    if (!strNextName.equals("device")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case -1291329255:
                    if (!strNextName.equals("events")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 3556:
                    if (!strNextName.equals("os")) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case 96801:
                    if (!strNextName.equals("app")) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 3599307:
                    if (!strNextName.equals("user")) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case 286956243:
                    if (!strNextName.equals("generator")) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case 1025385094:
                    if (!strNextName.equals("crashed")) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                case 2047016109:
                    if (!strNextName.equals("generatorType")) {
                        b = -1;
                    } else {
                        b = 11;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    builder.setStartedAt(jsonReader.nextLong());
                    break;
                case 1:
                    builder.setAppQualitySessionId(jsonReader.nextString());
                    break;
                case 2:
                    builder.setIdentifierFromUtf8Bytes(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    builder.setEndedAt(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 4:
                    builder.setDevice(parseDevice(jsonReader));
                    break;
                case 5:
                    builder.setEvents(parseArray(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda4
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final Object parse(JsonReader jsonReader2) {
                            return CrashlyticsReportJsonTransform.parseEvent(jsonReader2);
                        }
                    }));
                    break;
                case 6:
                    builder.setOs(parseOs(jsonReader));
                    break;
                case 7:
                    builder.setApp(parseApp(jsonReader));
                    break;
                case 8:
                    builder.setUser(parseUser(jsonReader));
                    break;
                case 9:
                    builder.setGenerator(jsonReader.nextString());
                    break;
                case 10:
                    builder.setCrashed(jsonReader.nextBoolean());
                    break;
                case 11:
                    builder.setGeneratorType(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static CrashlyticsReport.FilesPayload parseNdkPayload(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.FilesPayload.Builder builder = CrashlyticsReport.FilesPayload.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("files")) {
                builder.setFiles(parseArray(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda7
                    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                    public final Object parse(JsonReader jsonReader2) {
                        return CrashlyticsReportJsonTransform.parseFile(jsonReader2);
                    }
                }));
            } else if (strNextName.equals("orgId")) {
                builder.setOrgId(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    private static CrashlyticsReport.ApplicationExitInfo parseAppExitInfo(JsonReader jsonReader) throws IOException {
        byte b;
        CrashlyticsReport.ApplicationExitInfo.Builder builder = CrashlyticsReport.ApplicationExitInfo.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName.hashCode()) {
                case -1516200806:
                    if (!strNextName.equals("buildIdMappingForArch")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 110987:
                    if (!strNextName.equals("pid")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 111312:
                    if (!strNextName.equals("pss")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 113234:
                    if (!strNextName.equals("rss")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 55126294:
                    if (!strNextName.equals("timestamp")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 202325402:
                    if (!strNextName.equals("processName")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 722137681:
                    if (!strNextName.equals("reasonCode")) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case 723857505:
                    if (!strNextName.equals("traceFile")) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 2125650548:
                    if (!strNextName.equals("importance")) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    builder.setBuildIdMappingForArch(parseArray(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda1
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final Object parse(JsonReader jsonReader2) {
                            return CrashlyticsReportJsonTransform.parseBuildIdMappingForArch(jsonReader2);
                        }
                    }));
                    break;
                case 1:
                    builder.setPid(jsonReader.nextInt());
                    break;
                case 2:
                    builder.setPss(jsonReader.nextLong());
                    break;
                case 3:
                    builder.setRss(jsonReader.nextLong());
                    break;
                case 4:
                    builder.setTimestamp(jsonReader.nextLong());
                    break;
                case 5:
                    builder.setProcessName(jsonReader.nextString());
                    break;
                case 6:
                    builder.setReasonCode(jsonReader.nextInt());
                    break;
                case 7:
                    builder.setTraceFile(jsonReader.nextString());
                    break;
                case 8:
                    builder.setImportance(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CrashlyticsReport.FilesPayload.File parseFile(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.FilesPayload.File.Builder builder = CrashlyticsReport.FilesPayload.File.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("filename")) {
                builder.setFilename(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                builder.setContents(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static CrashlyticsReport.Session.User parseUser(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.User.Builder builder = CrashlyticsReport.Session.User.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                builder.setIdentifier(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    private static CrashlyticsReport.Session.Application parseApp(JsonReader jsonReader) throws IOException {
        byte b;
        CrashlyticsReport.Session.Application.Builder builder = CrashlyticsReport.Session.Application.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName.hashCode()) {
                case -1618432855:
                    if (!strNextName.equals("identifier")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -519438642:
                    if (!strNextName.equals("developmentPlatform")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 213652010:
                    if (!strNextName.equals("developmentPlatformVersion")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 351608024:
                    if (!strNextName.equals("version")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 719853845:
                    if (!strNextName.equals("installationUuid")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 1975623094:
                    if (!strNextName.equals("displayVersion")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                builder.setIdentifier(jsonReader.nextString());
            } else if (b == 1) {
                builder.setDevelopmentPlatform(jsonReader.nextString());
            } else if (b == 2) {
                builder.setDevelopmentPlatformVersion(jsonReader.nextString());
            } else if (b == 3) {
                builder.setVersion(jsonReader.nextString());
            } else if (b == 4) {
                builder.setInstallationUuid(jsonReader.nextString());
            } else if (b == 5) {
                builder.setDisplayVersion(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    private static CrashlyticsReport.Session.OperatingSystem parseOs(JsonReader jsonReader) throws IOException {
        byte b;
        CrashlyticsReport.Session.OperatingSystem.Builder builder = CrashlyticsReport.Session.OperatingSystem.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName.hashCode()) {
                case -911706486:
                    if (!strNextName.equals("buildVersion")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -293026577:
                    if (!strNextName.equals("jailbroken")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 351608024:
                    if (!strNextName.equals("version")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 1874684019:
                    if (!strNextName.equals("platform")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                builder.setBuildVersion(jsonReader.nextString());
            } else if (b == 1) {
                builder.setJailbroken(jsonReader.nextBoolean());
            } else if (b == 2) {
                builder.setVersion(jsonReader.nextString());
            } else if (b == 3) {
                builder.setPlatform(jsonReader.nextInt());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    private static CrashlyticsReport.Session.Device parseDevice(JsonReader jsonReader) throws IOException {
        byte b;
        CrashlyticsReport.Session.Device.Builder builder = CrashlyticsReport.Session.Device.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName.hashCode()) {
                case -1981332476:
                    if (!strNextName.equals("simulator")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -1969347631:
                    if (!strNextName.equals("manufacturer")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 112670:
                    if (!strNextName.equals("ram")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 3002454:
                    if (!strNextName.equals("arch")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 81784169:
                    if (!strNextName.equals("diskSpace")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 94848180:
                    if (!strNextName.equals("cores")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 104069929:
                    if (!strNextName.equals("model")) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case 109757585:
                    if (!strNextName.equals(RemoteConfigConstants.ResponseFieldKey.STATE)) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 2078953423:
                    if (!strNextName.equals("modelClass")) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    builder.setSimulator(jsonReader.nextBoolean());
                    break;
                case 1:
                    builder.setManufacturer(jsonReader.nextString());
                    break;
                case 2:
                    builder.setRam(jsonReader.nextLong());
                    break;
                case 3:
                    builder.setArch(jsonReader.nextInt());
                    break;
                case 4:
                    builder.setDiskSpace(jsonReader.nextLong());
                    break;
                case 5:
                    builder.setCores(jsonReader.nextInt());
                    break;
                case 6:
                    builder.setModel(jsonReader.nextString());
                    break;
                case 7:
                    builder.setState(jsonReader.nextInt());
                    break;
                case 8:
                    builder.setModelClass(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    public static CrashlyticsReport.Session.Event parseEvent(JsonReader jsonReader) throws IOException {
        byte b;
        CrashlyticsReport.Session.Event.Builder builder = CrashlyticsReport.Session.Event.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName.hashCode()) {
                case -1335157162:
                    if (!strNextName.equals("device")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -259312414:
                    if (!strNextName.equals("rollouts")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 96801:
                    if (!strNextName.equals("app")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 107332:
                    if (!strNextName.equals("log")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 3575610:
                    if (!strNextName.equals("type")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 55126294:
                    if (!strNextName.equals("timestamp")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                builder.setDevice(parseEventDevice(jsonReader));
            } else if (b == 1) {
                builder.setRollouts(parseEventRolloutsState(jsonReader));
            } else if (b == 2) {
                builder.setApp(parseEventApp(jsonReader));
            } else if (b == 3) {
                builder.setLog(parseEventLog(jsonReader));
            } else if (b == 4) {
                builder.setType(jsonReader.nextString());
            } else if (b == 5) {
                builder.setTimestamp(jsonReader.nextLong());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    private static CrashlyticsReport.Session.Event.Application parseEventApp(JsonReader jsonReader) throws IOException {
        byte b;
        CrashlyticsReport.Session.Event.Application.Builder builder = CrashlyticsReport.Session.Event.Application.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName.hashCode()) {
                case -1405314732:
                    if (!strNextName.equals("appProcessDetails")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -1332194002:
                    if (!strNextName.equals("background")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case -1090974952:
                    if (!strNextName.equals("execution")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case -80231855:
                    if (!strNextName.equals("internalKeys")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 555169704:
                    if (!strNextName.equals("customAttributes")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 928737948:
                    if (!strNextName.equals("uiOrientation")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 1847730860:
                    if (!strNextName.equals("currentProcessDetails")) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    builder.setAppProcessDetails(parseArray(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda3
                        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1915890493;

                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final Object parse(JsonReader jsonReader2) {
                            return CrashlyticsReportJsonTransform.parseProcessDetails(jsonReader2);
                        }
                    }));
                    break;
                case 1:
                    builder.setBackground(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 2:
                    builder.setExecution(parseEventExecution(jsonReader));
                    break;
                case 3:
                    builder.setInternalKeys(parseArray(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda2
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final Object parse(JsonReader jsonReader2) {
                            return CrashlyticsReportJsonTransform.parseCustomAttribute(jsonReader2);
                        }
                    }));
                    break;
                case 4:
                    builder.setCustomAttributes(parseArray(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda2
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final Object parse(JsonReader jsonReader2) {
                            return CrashlyticsReportJsonTransform.parseCustomAttribute(jsonReader2);
                        }
                    }));
                    break;
                case 5:
                    builder.setUiOrientation(jsonReader.nextInt());
                    break;
                case 6:
                    builder.setCurrentProcessDetails(parseProcessDetails(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    public static CrashlyticsReport.Session.Event.Application.ProcessDetails parseProcessDetails(JsonReader jsonReader) throws IOException {
        byte b;
        CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder builder = CrashlyticsReport.Session.Event.Application.ProcessDetails.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName.hashCode()) {
                case 110987:
                    if (!strNextName.equals("pid")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 202325402:
                    if (!strNextName.equals("processName")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 1694598382:
                    if (!strNextName.equals("defaultProcess")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 2125650548:
                    if (!strNextName.equals("importance")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                builder.setPid(jsonReader.nextInt());
            } else if (b == 1) {
                builder.setProcessName(jsonReader.nextString());
            } else if (b == 2) {
                builder.setDefaultProcess(jsonReader.nextBoolean());
            } else if (b == 3) {
                builder.setImportance(jsonReader.nextInt());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    private static CrashlyticsReport.Session.Event.Application.Execution parseEventExecution(JsonReader jsonReader) throws IOException {
        byte b;
        CrashlyticsReport.Session.Event.Application.Execution.Builder builder = CrashlyticsReport.Session.Event.Application.Execution.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName.hashCode()) {
                case -1375141843:
                    if (!strNextName.equals("appExitInfo")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -1337936983:
                    if (!strNextName.equals("threads")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case -902467928:
                    if (!strNextName.equals("signal")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 937615455:
                    if (!strNextName.equals("binaries")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 1481625679:
                    if (!strNextName.equals("exception")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                builder.setAppExitInfo(parseAppExitInfo(jsonReader));
            } else if (b == 1) {
                builder.setThreads(parseArray(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda5
                    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                    public final Object parse(JsonReader jsonReader2) {
                        return CrashlyticsReportJsonTransform.parseEventThread(jsonReader2);
                    }
                }));
            } else if (b == 2) {
                builder.setSignal(parseEventSignal(jsonReader));
            } else if (b == 3) {
                builder.setBinaries(parseArray(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda6
                    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                    public final Object parse(JsonReader jsonReader2) {
                        return CrashlyticsReportJsonTransform.parseEventBinaryImage(jsonReader2);
                    }
                }));
            } else if (b == 4) {
                builder.setException(parseEventExecutionException(jsonReader));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    private static CrashlyticsReport.Session.Event.Application.Execution.Exception parseEventExecutionException(JsonReader jsonReader) throws IOException {
        byte b;
        CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builder = CrashlyticsReport.Session.Event.Application.Execution.Exception.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName.hashCode()) {
                case -1266514778:
                    if (!strNextName.equals("frames")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -934964668:
                    if (!strNextName.equals("reason")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 3575610:
                    if (!strNextName.equals("type")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 91997906:
                    if (!strNextName.equals("causedBy")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 581754413:
                    if (!strNextName.equals("overflowCount")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                builder.setFrames(parseArray(jsonReader, new CrashlyticsReportJsonTransform$$ExternalSyntheticLambda0()));
            } else if (b == 1) {
                builder.setReason(jsonReader.nextString());
            } else if (b == 2) {
                builder.setType(jsonReader.nextString());
            } else if (b == 3) {
                builder.setCausedBy(parseEventExecutionException(jsonReader));
            } else if (b == 4) {
                builder.setOverflowCount(jsonReader.nextInt());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    private static CrashlyticsReport.Session.Event.Application.Execution.Signal parseEventSignal(JsonReader jsonReader) throws IOException {
        byte b;
        CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder = CrashlyticsReport.Session.Event.Application.Execution.Signal.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -1147692044) {
                if (iHashCode != 3059181) {
                    if (iHashCode == 3373707 && strNextName.equals("name")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (strNextName.equals("code")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (strNextName.equals(PlaceTypes.ADDRESS)) {
                b = 0;
            } else {
                b = -1;
            }
            if (b == 0) {
                builder.setAddress(jsonReader.nextLong());
            } else if (b == 1) {
                builder.setCode(jsonReader.nextString());
            } else if (b == 2) {
                builder.setName(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    public static CrashlyticsReport.Session.Event.Application.Execution.BinaryImage parseEventBinaryImage(JsonReader jsonReader) throws IOException {
        byte b;
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder builder = CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName.hashCode()) {
                case 3373707:
                    if (!strNextName.equals("name")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 3530753:
                    if (!strNextName.equals("size")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 3601339:
                    if (!strNextName.equals("uuid")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 1153765347:
                    if (!strNextName.equals("baseAddress")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                builder.setName(jsonReader.nextString());
            } else if (b == 1) {
                builder.setSize(jsonReader.nextLong());
            } else if (b == 2) {
                builder.setUuidFromUtf8Bytes(Base64.decode(jsonReader.nextString(), 2));
            } else if (b == 3) {
                builder.setBaseAddress(jsonReader.nextLong());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    public static CrashlyticsReport.Session.Event.Application.Execution.Thread parseEventThread(JsonReader jsonReader) throws IOException {
        byte b;
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder builder = CrashlyticsReport.Session.Event.Application.Execution.Thread.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -1266514778) {
                if (iHashCode != 3373707) {
                    if (iHashCode == 2125650548 && strNextName.equals("importance")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (strNextName.equals("name")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (strNextName.equals("frames")) {
                b = 0;
            } else {
                b = -1;
            }
            if (b == 0) {
                builder.setFrames(parseArray(jsonReader, new CrashlyticsReportJsonTransform$$ExternalSyntheticLambda0()));
            } else if (b == 1) {
                builder.setName(jsonReader.nextString());
            } else if (b == 2) {
                builder.setImportance(jsonReader.nextInt());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    public static CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame parseEventFrame(JsonReader jsonReader) throws IOException {
        byte b;
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder = CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName.hashCode()) {
                case -1019779949:
                    if (!strNextName.equals(TypedValues.CycleType.S_WAVE_OFFSET)) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -887523944:
                    if (!strNextName.equals("symbol")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 3571:
                    if (!strNextName.equals("pc")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 3143036:
                    if (!strNextName.equals("file")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 2125650548:
                    if (!strNextName.equals("importance")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                builder.setOffset(jsonReader.nextLong());
            } else if (b == 1) {
                builder.setSymbol(jsonReader.nextString());
            } else if (b == 2) {
                builder.setPc(jsonReader.nextLong());
            } else if (b == 3) {
                builder.setFile(jsonReader.nextString());
            } else if (b == 4) {
                builder.setImportance(jsonReader.nextInt());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    private static CrashlyticsReport.Session.Event.Device parseEventDevice(JsonReader jsonReader) throws IOException {
        byte b;
        CrashlyticsReport.Session.Event.Device.Builder builder = CrashlyticsReport.Session.Event.Device.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName.hashCode()) {
                case -1708606089:
                    if (!strNextName.equals("batteryLevel")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -1455558134:
                    if (!strNextName.equals("batteryVelocity")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case -1439500848:
                    if (!strNextName.equals("orientation")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 279795450:
                    if (!strNextName.equals("diskUsed")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 976541947:
                    if (!strNextName.equals("ramUsed")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 1516795582:
                    if (!strNextName.equals("proximityOn")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                builder.setBatteryLevel(Double.valueOf(jsonReader.nextDouble()));
            } else if (b == 1) {
                builder.setBatteryVelocity(jsonReader.nextInt());
            } else if (b == 2) {
                builder.setOrientation(jsonReader.nextInt());
            } else if (b == 3) {
                builder.setDiskUsed(jsonReader.nextLong());
            } else if (b == 4) {
                builder.setRamUsed(jsonReader.nextLong());
            } else if (b == 5) {
                builder.setProximityOn(jsonReader.nextBoolean());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static CrashlyticsReport.Session.Event.Log parseEventLog(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Log.Builder builder = CrashlyticsReport.Session.Event.Log.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals(FirebaseAnalytics.Param.CONTENT)) {
                builder.setContent(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static CrashlyticsReport.Session.Event.RolloutsState parseEventRolloutsState(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.RolloutsState.Builder builder = CrashlyticsReport.Session.Event.RolloutsState.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("assignments")) {
                builder.setRolloutAssignments(parseArray(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda8
                    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                    public final Object parse(JsonReader jsonReader2) {
                        return CrashlyticsReportJsonTransform.parseEventRolloutsAssignment(jsonReader2);
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    public static CrashlyticsReport.Session.Event.RolloutAssignment parseEventRolloutsAssignment(JsonReader jsonReader) throws IOException {
        byte b;
        CrashlyticsReport.Session.Event.RolloutAssignment.Builder builder = CrashlyticsReport.Session.Event.RolloutAssignment.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName.hashCode()) {
                case -1536268810:
                    if (!strNextName.equals("parameterKey")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -1027290370:
                    if (!strNextName.equals(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER)) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 1098747284:
                    if (!strNextName.equals("rolloutVariant")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 1124454216:
                    if (!strNextName.equals("parameterValue")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                builder.setParameterKey(jsonReader.nextString());
            } else if (b == 1) {
                builder.setTemplateVersion(jsonReader.nextLong());
            } else if (b == 2) {
                builder.setRolloutVariant(parseRolloutAssignmentRolloutVariant(jsonReader));
            } else if (b == 3) {
                builder.setParameterValue(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant parseRolloutAssignmentRolloutVariant(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder builder = CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("variantId")) {
                builder.setVariantId(jsonReader.nextString());
            } else if (strNextName.equals(ConfigContainer.ROLLOUT_METADATA_ID)) {
                builder.setRolloutId(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CrashlyticsReport.CustomAttribute parseCustomAttribute(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.CustomAttribute.Builder builder = CrashlyticsReport.CustomAttribute.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("key")) {
                builder.setKey(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                builder.setValue(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    public static CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch parseBuildIdMappingForArch(JsonReader jsonReader) throws IOException {
        byte b;
        CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder builder = CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -609862170) {
                if (iHashCode != 3002454) {
                    if (iHashCode == 230943785 && strNextName.equals("buildId")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (strNextName.equals("arch")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (strNextName.equals("libraryName")) {
                b = 0;
            } else {
                b = -1;
            }
            if (b == 0) {
                builder.setLibraryName(jsonReader.nextString());
            } else if (b == 1) {
                builder.setArch(jsonReader.nextString());
            } else if (b == 2) {
                builder.setBuildId(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static <T> List<T> parseArray(JsonReader jsonReader, ObjectParser<T> objectParser) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(objectParser.parse(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }
}
