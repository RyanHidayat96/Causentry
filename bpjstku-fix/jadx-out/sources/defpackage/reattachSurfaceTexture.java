package defpackage;

import defpackage.RotationProvider1;
import defpackage.reattachSurfaceTexture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.TuplesKt;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final class reattachSurfaceTexture {
    /* JADX WARN: Code duplicated, block: B:156:0x03d2 A[Catch: all -> 0x04f3, TryCatch #13 {all -> 0x04f3, blocks: (B:156:0x03d2, B:157:0x0427, B:159:0x042d, B:161:0x043d, B:163:0x0445, B:165:0x044d, B:166:0x0457, B:167:0x0491, B:171:0x04a2, B:154:0x03cd, B:185:0x04d5, B:186:0x04d8, B:178:0x04b6, B:181:0x04ca, B:182:0x04d1, B:187:0x04d9, B:188:0x04f2, B:150:0x03c7), top: B:224:0x0029, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x042d A[Catch: all -> 0x04f3, TryCatch #13 {all -> 0x04f3, blocks: (B:156:0x03d2, B:157:0x0427, B:159:0x042d, B:161:0x043d, B:163:0x0445, B:165:0x044d, B:166:0x0457, B:167:0x0491, B:171:0x04a2, B:154:0x03cd, B:185:0x04d5, B:186:0x04d8, B:178:0x04b6, B:181:0x04ca, B:182:0x04d1, B:187:0x04d9, B:188:0x04f2, B:150:0x03c7), top: B:224:0x0029, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0445 A[Catch: all -> 0x04f3, TryCatch #13 {all -> 0x04f3, blocks: (B:156:0x03d2, B:157:0x0427, B:159:0x042d, B:161:0x043d, B:163:0x0445, B:165:0x044d, B:166:0x0457, B:167:0x0491, B:171:0x04a2, B:154:0x03cd, B:185:0x04d5, B:186:0x04d8, B:178:0x04b6, B:181:0x04ca, B:182:0x04d1, B:187:0x04d9, B:188:0x04f2, B:150:0x03c7), top: B:224:0x0029, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x0457 A[Catch: all -> 0x04f3, LOOP:3: B:161:0x043d->B:166:0x0457, LOOP_END, TryCatch #13 {all -> 0x04f3, blocks: (B:156:0x03d2, B:157:0x0427, B:159:0x042d, B:161:0x043d, B:163:0x0445, B:165:0x044d, B:166:0x0457, B:167:0x0491, B:171:0x04a2, B:154:0x03cd, B:185:0x04d5, B:186:0x04d8, B:178:0x04b6, B:181:0x04ca, B:182:0x04d1, B:187:0x04d9, B:188:0x04f2, B:150:0x03c7), top: B:224:0x0029, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x04a2 A[Catch: all -> 0x04f3, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x04f3, blocks: (B:156:0x03d2, B:157:0x0427, B:159:0x042d, B:161:0x043d, B:163:0x0445, B:165:0x044d, B:166:0x0457, B:167:0x0491, B:171:0x04a2, B:154:0x03cd, B:185:0x04d5, B:186:0x04d8, B:178:0x04b6, B:181:0x04ca, B:182:0x04d1, B:187:0x04d9, B:188:0x04f2, B:150:0x03c7), top: B:224:0x0029, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x049e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x04fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x043d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x044d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0427 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x0427 A[EDGE_INSN: B:255:0x0427->B:253:0x0427 BREAK  A[LOOP:3: B:161:0x043d->B:166:0x0457], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:? A[SYNTHETIC] */
    public static final lambdatryToComplete0 TuitionPaymentFragmentspecialinlinedviewModeldefault2(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, animateToFullOpacity animatetofullopacity, Function1<? super r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw, Boolean> function1) throws Throwable {
        orientationToSurfaceRotation orientationtosurfacerotation;
        Throwable th;
        Throwable th2;
        Unit unit;
        Throwable th3;
        Unit unit2;
        String str;
        ArrayList arrayList;
        RotationProvider1 rotationProvider1;
        Unit unit3;
        Throwable th4;
        Map mapMutableMapOf;
        Iterator it;
        r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw r8lambdahcn9bxmal9aalzj1mxukgx6yonw;
        SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1;
        r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw r8lambdahcn9bxmal9aalzj1mxukgx6yonw2;
        RotationProvider1 rotationProvider2;
        long j;
        SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda2 = surfaceViewImplementationExternalSyntheticLambda1;
        animateToFullOpacity animatetofullopacity2 = animatetofullopacity;
        Function1<? super r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw, Boolean> function2 = function1;
        String str2 = "";
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda2, "");
        Intrinsics.checkNotNullParameter(animatetofullopacity2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        orientationToSurfaceRotation orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1 = animatetofullopacity2.TuitionPaymentFragmentbindingInflater1(surfaceViewImplementationExternalSyntheticLambda2);
        try {
            orientationToSurfaceRotation orientationtosurfacerotation2 = orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1;
            long jTuitionPaymentFragmentspecialinlinedviewModeldefault3 = orientationtosurfacerotation2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            long j2 = jTuitionPaymentFragmentspecialinlinedviewModeldefault3 - 22;
            long j3 = 0;
            try {
                if (j2 < 0) {
                    StringBuilder sb = new StringBuilder("not a zip: size=");
                    sb.append(orientationtosurfacerotation2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                    throw new IOException(sb.toString());
                }
                long jMax = Math.max(jTuitionPaymentFragmentspecialinlinedviewModeldefault3 - 65558, 0L);
                while (true) {
                    RotationProvider1 rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(orientationtosurfacerotation2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j2));
                    try {
                        if (rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub() != 101010256) {
                            String str3 = str2;
                            orientationToSurfaceRotation orientationtosurfacerotation3 = orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1;
                            long j4 = j3;
                            animateToFullOpacity animatetofullopacity3 = animatetofullopacity2;
                            Function1<? super r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw, Boolean> function3 = function2;
                            SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda3 = surfaceViewImplementationExternalSyntheticLambda2;
                            rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                            j2--;
                            if (j2 < jMax) {
                                throw new IOException("not a zip: end of central directory signature not found");
                            }
                            surfaceViewImplementationExternalSyntheticLambda2 = surfaceViewImplementationExternalSyntheticLambda3;
                            j3 = j4;
                            orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1 = orientationtosurfacerotation3;
                            function2 = function3;
                            animatetofullopacity2 = animatetofullopacity3;
                            str2 = str3;
                        } else {
                            short sWrite = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.write();
                            short sWrite2 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.write();
                            long jWrite = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.write() & UShort.MAX_VALUE;
                            if (jWrite != (rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.write() & UShort.MAX_VALUE) || (sWrite & UShort.MAX_VALUE) != 0 || (sWrite2 & UShort.MAX_VALUE) != 0) {
                                try {
                                    throw new IOException("unsupported zip: spanned");
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } else {
                                rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.g(4L);
                                SurfaceViewImplementationSurfaceRequestCallbackExternalSyntheticLambda0 surfaceViewImplementationSurfaceRequestCallbackExternalSyntheticLambda0 = new SurfaceViewImplementationSurfaceRequestCallbackExternalSyntheticLambda0(jWrite, ((long) rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub()) & 4294967295L, rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.write() & UShort.MAX_VALUE);
                                String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(surfaceViewImplementationSurfaceRequestCallbackExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1);
                                rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                                long j5 = j2 - 20;
                                String str4 = " but was ";
                                String str5 = "bad zip: expected ";
                                if (j5 > 0) {
                                    try {
                                        RotationProvider1 rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault4 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(orientationtosurfacerotation2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j5));
                                        try {
                                            RotationProvider1 rotationProvider3 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                            if (rotationProvider3.INotificationSideChannelStub() == 117853008) {
                                                int iINotificationSideChannelStub = rotationProvider3.INotificationSideChannelStub();
                                                long jRemoteActionCompatParcelizer = rotationProvider3.RemoteActionCompatParcelizer();
                                                if (rotationProvider3.INotificationSideChannelStub() != 1 || iINotificationSideChannelStub != 0) {
                                                    throw new IOException("unsupported zip: spanned");
                                                }
                                                RotationProvider1 rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault5 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(orientationtosurfacerotation2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jRemoteActionCompatParcelizer));
                                                try {
                                                    RotationProvider1 rotationProvider4 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                                    int iINotificationSideChannelStub2 = rotationProvider4.INotificationSideChannelStub();
                                                    if (iINotificationSideChannelStub2 != 101075792) {
                                                        StringBuilder sb2 = new StringBuilder();
                                                        sb2.append("bad zip: expected ");
                                                        sb2.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2(101075792));
                                                        sb2.append(" but was ");
                                                        sb2.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2(iINotificationSideChannelStub2));
                                                        throw new IOException(sb2.toString());
                                                    }
                                                    rotationProvider4.g(12L);
                                                    int iINotificationSideChannelStub3 = rotationProvider4.INotificationSideChannelStub();
                                                    int iINotificationSideChannelStub4 = rotationProvider4.INotificationSideChannelStub();
                                                    long jRemoteActionCompatParcelizer2 = rotationProvider4.RemoteActionCompatParcelizer();
                                                    if (jRemoteActionCompatParcelizer2 != rotationProvider4.RemoteActionCompatParcelizer() || iINotificationSideChannelStub3 != 0 || iINotificationSideChannelStub4 != 0) {
                                                        throw new IOException("unsupported zip: spanned");
                                                    }
                                                    rotationProvider4.g(8L);
                                                    SurfaceViewImplementationSurfaceRequestCallbackExternalSyntheticLambda0 surfaceViewImplementationSurfaceRequestCallbackExternalSyntheticLambda1 = new SurfaceViewImplementationSurfaceRequestCallbackExternalSyntheticLambda0(jRemoteActionCompatParcelizer2, rotationProvider4.RemoteActionCompatParcelizer(), surfaceViewImplementationSurfaceRequestCallbackExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1);
                                                    try {
                                                        Unit unit4 = Unit.INSTANCE;
                                                        try {
                                                            rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault5.close();
                                                            th3 = null;
                                                        } catch (Throwable th6) {
                                                            th3 = th6;
                                                        }
                                                        surfaceViewImplementationSurfaceRequestCallbackExternalSyntheticLambda0 = surfaceViewImplementationSurfaceRequestCallbackExternalSyntheticLambda1;
                                                        unit2 = unit4;
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        surfaceViewImplementationSurfaceRequestCallbackExternalSyntheticLambda0 = surfaceViewImplementationSurfaceRequestCallbackExternalSyntheticLambda1;
                                                        Throwable th8 = th;
                                                        try {
                                                            rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault5.close();
                                                        } catch (Throwable th9) {
                                                            ExceptionsKt.addSuppressed(th8, th9);
                                                        }
                                                        th3 = th8;
                                                        unit2 = null;
                                                    }
                                                    if (th3 != null) {
                                                        throw th3;
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                }
                                            }
                                            unit = Unit.INSTANCE;
                                            try {
                                                rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault4.close();
                                                th2 = null;
                                            } catch (Throwable th11) {
                                                th2 = th11;
                                            }
                                        } catch (Throwable th12) {
                                            try {
                                                rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault4.close();
                                            } catch (Throwable th13) {
                                                ExceptionsKt.addSuppressed(th12, th13);
                                            }
                                            th2 = th12;
                                            unit = null;
                                        }
                                        if (th2 != null) {
                                            throw th2;
                                        }
                                    } catch (Throwable th14) {
                                        th = th14;
                                        orientationtosurfacerotation = orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1;
                                        if (orientationtosurfacerotation != null) {
                                            try {
                                                orientationtosurfacerotation.close();
                                                throw th;
                                            } catch (Throwable th15) {
                                                ExceptionsKt.addSuppressed(th, th15);
                                                throw th;
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList();
                                RotationProvider1 rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault6 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(orientationtosurfacerotation2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallbackExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                try {
                                    final RotationProvider1 rotationProvider5 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                    long j6 = surfaceViewImplementationSurfaceRequestCallbackExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    long j7 = 0;
                                    try {
                                        while (j7 < j6) {
                                            Intrinsics.checkNotNullParameter(rotationProvider5, str2);
                                            int iINotificationSideChannelStub5 = rotationProvider5.INotificationSideChannelStub();
                                            if (iINotificationSideChannelStub5 != 33639248) {
                                                StringBuilder sb3 = new StringBuilder(str5);
                                                sb3.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2(33639248));
                                                sb3.append(str4);
                                                sb3.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2(iINotificationSideChannelStub5));
                                                throw new IOException(sb3.toString());
                                            }
                                            rotationProvider5.g(4L);
                                            short sWrite3 = rotationProvider5.write();
                                            if ((sWrite3 & 1) != 0) {
                                                StringBuilder sb4 = new StringBuilder("unsupported zip: general purpose bit flag=");
                                                sb4.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2(65535 & sWrite3));
                                                throw new IOException(sb4.toString());
                                            }
                                            short sWrite4 = rotationProvider5.write();
                                            short sWrite5 = rotationProvider5.write();
                                            short sWrite6 = rotationProvider5.write();
                                            long jINotificationSideChannelStub = rotationProvider5.INotificationSideChannelStub();
                                            String str6 = str2;
                                            final Ref.LongRef longRef = new Ref.LongRef();
                                            long j8 = j6;
                                            longRef.element = ((long) rotationProvider5.INotificationSideChannelStub()) & 4294967295L;
                                            final Ref.LongRef longRef2 = new Ref.LongRef();
                                            orientationtosurfacerotation = orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1;
                                            rotationProvider1 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                            try {
                                                longRef2.element = ((long) rotationProvider5.INotificationSideChannelStub()) & 4294967295L;
                                                short sWrite7 = rotationProvider5.write();
                                                short sWrite8 = rotationProvider5.write();
                                                short sWrite9 = rotationProvider5.write();
                                                str = strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                arrayList = arrayList2;
                                                try {
                                                    rotationProvider5.g(8L);
                                                    final Ref.LongRef longRef3 = new Ref.LongRef();
                                                    longRef3.element = ((long) rotationProvider5.INotificationSideChannelStub()) & 4294967295L;
                                                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = rotationProvider5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sWrite7 & UShort.MAX_VALUE);
                                                    String str7 = str4;
                                                    String str8 = str5;
                                                    try {
                                                        if (StringsKt.contains$default((CharSequence) strTuitionPaymentFragmentspecialinlinedviewModeldefault2, (char) 0, false, 2, (Object) null)) {
                                                            throw new IOException("bad zip: filename contains 0x00");
                                                        }
                                                        long j9 = longRef2.element == 4294967295L ? 8L : 0L;
                                                        if (longRef.element == 4294967295L) {
                                                            j = 8;
                                                            j9 += 8;
                                                        } else {
                                                            j = 8;
                                                        }
                                                        if (longRef3.element == 4294967295L) {
                                                            j9 += j;
                                                        }
                                                        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                                                        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                                                        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                                                        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                                                        final long j10 = j9;
                                                        SurfaceViewImplementationSurfaceRequestCallbackExternalSyntheticLambda0 surfaceViewImplementationSurfaceRequestCallbackExternalSyntheticLambda2 = surfaceViewImplementationSurfaceRequestCallbackExternalSyntheticLambda0;
                                                        b(rotationProvider5, sWrite8 & UShort.MAX_VALUE, new Function2<Integer, Long, Unit>() { // from class: okio.internal.ZipFilesKt$readCentralDirectoryZipEntry$1
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final /* synthetic */ Unit invoke(Integer num, Long l) throws IOException {
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2(num.intValue(), l.longValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, long j11) throws IOException {
                                                                if (i != 1) {
                                                                    if (i != 10) {
                                                                        return;
                                                                    }
                                                                    if (j11 < 4) {
                                                                        throw new IOException("bad zip: NTFS extra too short");
                                                                    }
                                                                    rotationProvider5.g(4L);
                                                                    final RotationProvider1 rotationProvider6 = rotationProvider5;
                                                                    final Ref.ObjectRef<Long> objectRef4 = objectRef;
                                                                    final Ref.ObjectRef<Long> objectRef5 = objectRef2;
                                                                    final Ref.ObjectRef<Long> objectRef6 = objectRef3;
                                                                    reattachSurfaceTexture.b(rotationProvider6, (int) (j11 - 4), new Function2<Integer, Long, Unit>() { // from class: okio.internal.ZipFilesKt$readCentralDirectoryZipEntry$1.1
                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public final /* synthetic */ Unit invoke(Integer num, Long l) throws IOException {
                                                                            TuitionPaymentFragmentbindingInflater1(num.intValue(), l.longValue());
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        /* JADX WARN: Type inference failed for: r4v11, types: [T, java.lang.Long] */
                                                                        /* JADX WARN: Type inference failed for: r4v5, types: [T, java.lang.Long] */
                                                                        /* JADX WARN: Type inference failed for: r4v8, types: [T, java.lang.Long] */
                                                                        public final void TuitionPaymentFragmentbindingInflater1(int i2, long j12) throws IOException {
                                                                            if (i2 == 1) {
                                                                                if (objectRef4.element != null) {
                                                                                    throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                                                                                }
                                                                                if (j12 != 24) {
                                                                                    throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                                                                                }
                                                                                objectRef4.element = Long.valueOf(rotationProvider6.RemoteActionCompatParcelizer());
                                                                                objectRef5.element = Long.valueOf(rotationProvider6.RemoteActionCompatParcelizer());
                                                                                objectRef6.element = Long.valueOf(rotationProvider6.RemoteActionCompatParcelizer());
                                                                            }
                                                                        }

                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(2);
                                                                        }
                                                                    });
                                                                    return;
                                                                }
                                                                if (booleanRef.element) {
                                                                    throw new IOException("bad zip: zip64 extra repeated");
                                                                }
                                                                booleanRef.element = true;
                                                                if (j11 < j10) {
                                                                    throw new IOException("bad zip: zip64 extra too short");
                                                                }
                                                                Ref.LongRef longRef4 = longRef2;
                                                                longRef4.element = longRef4.element == 4294967295L ? rotationProvider5.RemoteActionCompatParcelizer() : longRef2.element;
                                                                Ref.LongRef longRef5 = longRef;
                                                                longRef5.element = longRef5.element == 4294967295L ? rotationProvider5.RemoteActionCompatParcelizer() : 0L;
                                                                Ref.LongRef longRef6 = longRef3;
                                                                longRef6.element = longRef6.element == 4294967295L ? rotationProvider5.RemoteActionCompatParcelizer() : 0L;
                                                            }

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(2);
                                                            }
                                                        });
                                                        if (j9 > 0) {
                                                            try {
                                                                if (!booleanRef.element) {
                                                                    throw new IOException("bad zip: zip64 extra required but absent");
                                                                }
                                                            } catch (Throwable th16) {
                                                                th4 = th16;
                                                                unit3 = null;
                                                            }
                                                        }
                                                        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = rotationProvider5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sWrite9 & UShort.MAX_VALUE);
                                                        SurfaceViewImplementationExternalSyntheticLambda1.Companion companion = SurfaceViewImplementationExternalSyntheticLambda1.INSTANCE;
                                                        unit3 = null;
                                                        try {
                                                            r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw r8lambdahcn9bxmal9aalzj1mxukgx6yonw3 = new r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw(SurfaceViewImplementationExternalSyntheticLambda1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3("/").b(strTuitionPaymentFragmentspecialinlinedviewModeldefault2), StringsKt.endsWith$default(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, "/", false, 2, (Object) null), strTuitionPaymentFragmentspecialinlinedviewModeldefault3, jINotificationSideChannelStub & 4294967295L, longRef.element, longRef2.element, sWrite4 & UShort.MAX_VALUE, longRef3.element, sWrite6 & UShort.MAX_VALUE, sWrite5 & UShort.MAX_VALUE, (Long) objectRef.element, (Long) objectRef2.element, (Long) objectRef3.element, null, null, null, 57344, null);
                                                            surfaceViewImplementationSurfaceRequestCallbackExternalSyntheticLambda0 = surfaceViewImplementationSurfaceRequestCallbackExternalSyntheticLambda2;
                                                            if (r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.INotificationSideChannelStub >= surfaceViewImplementationSurfaceRequestCallbackExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                                                                throw new IOException("bad zip: local file header offset >= central directory offset");
                                                            }
                                                            if (function1.invoke(r8lambdahcn9bxmal9aalzj1mxukgx6yonw3).booleanValue()) {
                                                                arrayList.add(r8lambdahcn9bxmal9aalzj1mxukgx6yonw3);
                                                            }
                                                            j7++;
                                                            str2 = str6;
                                                            j6 = j8;
                                                            orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1 = orientationtosurfacerotation;
                                                            rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault6 = rotationProvider1;
                                                            strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
                                                            arrayList2 = arrayList;
                                                            str4 = str7;
                                                            str5 = str8;
                                                        } catch (Throwable th17) {
                                                            th = th17;
                                                        }
                                                    } catch (Throwable th18) {
                                                        th = th18;
                                                        unit3 = null;
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    unit3 = null;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                str = strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                arrayList = arrayList2;
                                            }
                                            unit3 = null;
                                            th4 = th;
                                            try {
                                                rotationProvider1.close();
                                            } catch (Throwable th21) {
                                                ExceptionsKt.addSuppressed(th4, th21);
                                            }
                                            if (th4 == null) {
                                                throw th4;
                                            }
                                            SurfaceViewImplementationExternalSyntheticLambda1.Companion companion2 = SurfaceViewImplementationExternalSyntheticLambda1.INSTANCE;
                                            SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = SurfaceViewImplementationExternalSyntheticLambda1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3("/");
                                            mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentspecialinlinedviewModeldefault3, new r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw(surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentspecialinlinedviewModeldefault3, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
                                            it = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: reattachSurfaceTexture.5
                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // java.util.Comparator
                                                public final int compare(T t, T t2) {
                                                    return ComparisonsKt.compareValues(((r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw) t).b, ((r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw) t2).b);
                                                }
                                            }).iterator();
                                            while (it.hasNext()) {
                                                r8lambdahcn9bxmal9aalzj1mxukgx6yonw = (r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw) it.next();
                                                if (((r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw) mapMutableMapOf.put(r8lambdahcn9bxmal9aalzj1mxukgx6yonw.b, r8lambdahcn9bxmal9aalzj1mxukgx6yonw)) == null) {
                                                    while (true) {
                                                        surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1 = r8lambdahcn9bxmal9aalzj1mxukgx6yonw.b.TuitionPaymentFragmentbindingInflater1();
                                                        if (surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1 == null) {
                                                            break;
                                                        }
                                                        r8lambdahcn9bxmal9aalzj1mxukgx6yonw2 = (r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw) mapMutableMapOf.get(surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1);
                                                        if (r8lambdahcn9bxmal9aalzj1mxukgx6yonw2 != null) {
                                                            r8lambdahcn9bxmal9aalzj1mxukgx6yonw2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(r8lambdahcn9bxmal9aalzj1mxukgx6yonw.b);
                                                            break;
                                                        }
                                                        r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw r8lambdahcn9bxmal9aalzj1mxukgx6yonw4 = new r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw(surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                                                        mapMutableMapOf.put(surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1, r8lambdahcn9bxmal9aalzj1mxukgx6yonw4);
                                                        r8lambdahcn9bxmal9aalzj1mxukgx6yonw4.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(r8lambdahcn9bxmal9aalzj1mxukgx6yonw.b);
                                                        r8lambdahcn9bxmal9aalzj1mxukgx6yonw = r8lambdahcn9bxmal9aalzj1mxukgx6yonw4;
                                                        it = it;
                                                    }
                                                }
                                            }
                                            lambdatryToComplete0 lambdatrytocomplete0 = new lambdatryToComplete0(surfaceViewImplementationExternalSyntheticLambda1, animatetofullopacity, mapMutableMapOf, str);
                                            if (orientationtosurfacerotation != null) {
                                                try {
                                                    orientationtosurfacerotation.close();
                                                } catch (Throwable unused) {
                                                }
                                            }
                                            return lambdatrytocomplete0;
                                        }
                                        rotationProvider2.close();
                                        th4 = null;
                                    } catch (Throwable th22) {
                                        th4 = th22;
                                    }
                                    str = strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    arrayList = arrayList2;
                                    orientationtosurfacerotation = orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1;
                                    rotationProvider2 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                    Unit unit5 = Unit.INSTANCE;
                                    unit3 = unit5;
                                } catch (Throwable th23) {
                                    th = th23;
                                    str = strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    arrayList = arrayList2;
                                    orientationtosurfacerotation = orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1;
                                    rotationProvider1 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                }
                                if (th4 == null) {
                                    throw th4;
                                }
                                SurfaceViewImplementationExternalSyntheticLambda1.Companion companion3 = SurfaceViewImplementationExternalSyntheticLambda1.INSTANCE;
                                SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentspecialinlinedviewModeldefault4 = SurfaceViewImplementationExternalSyntheticLambda1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3("/");
                                mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentspecialinlinedviewModeldefault4, new r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw(surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentspecialinlinedviewModeldefault4, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
                                it = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: reattachSurfaceTexture.5
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.util.Comparator
                                    public final int compare(T t, T t2) {
                                        return ComparisonsKt.compareValues(((r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw) t).b, ((r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw) t2).b);
                                    }
                                }).iterator();
                                while (it.hasNext()) {
                                    r8lambdahcn9bxmal9aalzj1mxukgx6yonw = (r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw) it.next();
                                    if (((r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw) mapMutableMapOf.put(r8lambdahcn9bxmal9aalzj1mxukgx6yonw.b, r8lambdahcn9bxmal9aalzj1mxukgx6yonw)) == null) {
                                        while (true) {
                                            surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1 = r8lambdahcn9bxmal9aalzj1mxukgx6yonw.b.TuitionPaymentFragmentbindingInflater1();
                                            if (surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1 == null) {
                                                break;
                                                break;
                                            }
                                            r8lambdahcn9bxmal9aalzj1mxukgx6yonw2 = (r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw) mapMutableMapOf.get(surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1);
                                            if (r8lambdahcn9bxmal9aalzj1mxukgx6yonw2 != null) {
                                                r8lambdahcn9bxmal9aalzj1mxukgx6yonw2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(r8lambdahcn9bxmal9aalzj1mxukgx6yonw.b);
                                                break;
                                                break;
                                            }
                                            r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw r8lambdahcn9bxmal9aalzj1mxukgx6yonw5 = new r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw(surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                                            mapMutableMapOf.put(surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1, r8lambdahcn9bxmal9aalzj1mxukgx6yonw5);
                                            r8lambdahcn9bxmal9aalzj1mxukgx6yonw5.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(r8lambdahcn9bxmal9aalzj1mxukgx6yonw.b);
                                            r8lambdahcn9bxmal9aalzj1mxukgx6yonw = r8lambdahcn9bxmal9aalzj1mxukgx6yonw5;
                                            it = it;
                                        }
                                    }
                                }
                                lambdatryToComplete0 lambdatrytocomplete1 = new lambdatryToComplete0(surfaceViewImplementationExternalSyntheticLambda1, animatetofullopacity, mapMutableMapOf, str);
                                if (orientationtosurfacerotation != null) {
                                    orientationtosurfacerotation.close();
                                }
                                return lambdatrytocomplete1;
                            }
                        }
                    } catch (Throwable th24) {
                        th = th24;
                    }
                    rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                    throw th;
                }
            } catch (Throwable th25) {
                th = th25;
                th = th;
                if (orientationtosurfacerotation != null) {
                    orientationtosurfacerotation.close();
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th26) {
            th = th26;
            orientationtosurfacerotation = orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1;
        }
    }

    public static final void b(RotationProvider1 rotationProvider1, int i, Function2<? super Integer, ? super Long, Unit> function2) throws IOException {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iWrite = rotationProvider1.write() & UShort.MAX_VALUE;
            long jWrite = ((long) rotationProvider1.write()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j2 = j - 4;
            if (j2 < jWrite) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            rotationProvider1.asInterface(jWrite);
            long j3 = rotationProvider1.asInterface().size;
            function2.invoke(Integer.valueOf(iWrite), Long.valueOf(jWrite));
            long j4 = (rotationProvider1.asInterface().size + jWrite) - j3;
            if (j4 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for ".concat(String.valueOf(iWrite)));
            }
            if (j4 > 0) {
                rotationProvider1.asInterface().g(j4);
            }
            j = j2 - jWrite;
        }
    }

    public static final r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw TuitionPaymentFragmentspecialinlinedviewModeldefault3(final RotationProvider1 rotationProvider1, r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw r8lambdahcn9bxmal9aalzj1mxukgx6yonw) {
        int iINotificationSideChannelStub = rotationProvider1.INotificationSideChannelStub();
        if (iINotificationSideChannelStub != 67324752) {
            StringBuilder sb = new StringBuilder("bad zip: expected ");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2(67324752));
            sb.append(" but was ");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2(iINotificationSideChannelStub));
            throw new IOException(sb.toString());
        }
        rotationProvider1.g(2L);
        short sWrite = rotationProvider1.write();
        if ((sWrite & 1) != 0) {
            StringBuilder sb2 = new StringBuilder("unsupported zip: general purpose bit flag=");
            sb2.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2(sWrite & UShort.MAX_VALUE));
            throw new IOException(sb2.toString());
        }
        rotationProvider1.g(18L);
        long jWrite = rotationProvider1.write();
        int iWrite = 65535 & rotationProvider1.write();
        rotationProvider1.g(jWrite & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        if (r8lambdahcn9bxmal9aalzj1mxukgx6yonw == null) {
            rotationProvider1.g(iWrite);
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        b(rotationProvider1, iWrite, new Function2<Integer, Long, Unit>() { // from class: okio.internal.ZipFilesKt$readOrSkipLocalHeader$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Unit invoke(Integer num, Long l) throws IOException {
                b(num.intValue(), l.longValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r11v4, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r11v7, types: [T, java.lang.Integer] */
            public final void b(int i, long j) throws IOException {
                if (i == 21589) {
                    if (j < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    byte bCancel = rotationProvider1.cancel();
                    boolean z = (bCancel & 1) == 1;
                    boolean z2 = (bCancel & 2) == 2;
                    boolean z3 = (bCancel & 4) == 4;
                    RotationProvider1 rotationProvider2 = rotationProvider1;
                    long j2 = z ? 5L : 1L;
                    if (z2) {
                        j2 += 4;
                    }
                    if (z3) {
                        j2 += 4;
                    }
                    if (j < j2) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z) {
                        objectRef.element = Integer.valueOf(rotationProvider2.INotificationSideChannelStub());
                    }
                    if (z2) {
                        objectRef2.element = Integer.valueOf(rotationProvider1.INotificationSideChannelStub());
                    }
                    if (z3) {
                        objectRef3.element = Integer.valueOf(rotationProvider1.INotificationSideChannelStub());
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        });
        return r8lambdahcn9bxmal9aalzj1mxukgx6yonw.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Integer) objectRef.element, (Integer) objectRef2.element, (Integer) objectRef3.element);
    }

    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        StringBuilder sb = new StringBuilder("0x");
        String string = Integer.toString(i, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "");
        sb.append(string);
        return sb.toString();
    }
}
