package com.datadog.android.core.internal.persistence.file.batch;

import androidx.exifinterface.media.ExifInterface;
import com.datadog.android.api.InternalLogger;
import defpackage.ImageCapture;
import defpackage.ImageCaptureOutputFileResults;
import defpackage.ImageInfo;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0003\u0010\u001a\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0003\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0003\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u000b\u0010\u0016J'\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/batch/PlainBatchFileReaderWriter;", "LImageInfo;", "Lcom/datadog/android/api/InternalLogger;", "p0", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "", "p1", "", "p2", "", "TuitionPaymentFragmentbindingInflater1", "(IILjava/lang/String;)Z", "Ljava/io/InputStream;", "Lcom/datadog/android/core/internal/persistence/file/batch/PlainBatchFileReaderWriter$BlockType;", "Lcom/datadog/android/core/internal/persistence/file/batch/PlainBatchFileReaderWriter$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/io/InputStream;Lcom/datadog/android/core/internal/persistence/file/batch/PlainBatchFileReaderWriter$BlockType;)Lcom/datadog/android/core/internal/persistence/file/batch/PlainBatchFileReaderWriter$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Ljava/io/File;", "", "LImageCapture;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/io/File;)Ljava/util/List;", "(Ljava/io/File;LImageCapture;Z)Z", "Lcom/datadog/android/api/InternalLogger;", "b", "BlockType"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class PlainBatchFileReaderWriter implements ImageInfo {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public PlainBatchFileReaderWriter(InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = internalLogger;
    }

    @Override // defpackage.getTotalCaptureLatencyMillis
    public final List<ImageCapture> TuitionPaymentFragmentspecialinlinedviewModeldefault1(final File p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            return TuitionPaymentFragmentbindingInflater1(p0);
        } catch (IOException e2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$readData$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{p0.getPath()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, e2, false, null);
            return CollectionsKt.emptyList();
        } catch (SecurityException e3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$readData$2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "ERROR_READ.format(Locale.US, file.path)";
                }
            }, e3, false, null);
            return CollectionsKt.emptyList();
        }
    }

    private final List<ImageCapture> TuitionPaymentFragmentbindingInflater1(final File p0) throws IOException {
        int iD = (int) ImageCaptureOutputFileResults.d(p0, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(p0), 8192);
        try {
            BufferedInputStream bufferedInputStream2 = bufferedInputStream;
            int i = iD;
            while (i > 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferedInputStream2, BlockType.META);
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault4.b != null) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferedInputStream2, BlockType.EVENT);
                    i -= TuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + TuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault5.b == null) {
                        break;
                    }
                    arrayList.add(new ImageCapture(TuitionPaymentFragmentspecialinlinedviewModeldefault5.b, TuitionPaymentFragmentspecialinlinedviewModeldefault4.b));
                } else {
                    i -= TuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    break;
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(bufferedInputStream, null);
            if (i == 0 && (iD <= 0 || !arrayList.isEmpty())) {
                return arrayList;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$readFileData$2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "File %s is probably corrupted, not all content was read.", Arrays.copyOf(new Object[]{p0.getPath()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, null, false, null);
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(bufferedInputStream, th);
                throw th2;
            }
        }
    }

    private final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3(InputStream p0, final BlockType p1) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        int i = p0.read(byteBufferAllocate.array());
        String strName = p1.name();
        StringBuilder sb = new StringBuilder("Block(");
        sb.append(strName);
        sb.append("): Header read");
        if (!TuitionPaymentFragmentbindingInflater1(6, i, sb.toString())) {
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(null, Math.max(0, i));
        }
        final short s = byteBufferAllocate.getShort();
        if (s == p1.getIdentifier()) {
            int i2 = byteBufferAllocate.getInt();
            byte[] bArr = new byte[i2];
            int i3 = p0.read(bArr);
            String strName2 = p1.name();
            StringBuilder sb2 = new StringBuilder("Block(");
            sb2.append(strName2);
            sb2.append("):Data read");
            if (TuitionPaymentFragmentbindingInflater1(i2, i3, sb2.toString())) {
                return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr, i + i3);
            }
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(null, i + Math.max(0, i3));
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$readBlock$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                short s2 = s;
                PlainBatchFileReaderWriter.BlockType blockType = p1;
                short identifier = blockType.getIdentifier();
                StringBuilder sb3 = new StringBuilder("Unexpected block type identifier=");
                sb3.append((int) s2);
                sb3.append(" met, was expecting ");
                sb3.append(blockType);
                sb3.append("(");
                sb3.append((int) identifier);
                sb3.append(")");
                return sb3.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, null, false, null);
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(null, i);
    }

    private final boolean TuitionPaymentFragmentbindingInflater1(final int p0, final int p1, final String p2) {
        if (p0 == p1) {
            return true;
        }
        if (p1 != -1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$checkReadExpected$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = p2;
                    int i = p0;
                    int i2 = p1;
                    StringBuilder sb = new StringBuilder("Number of bytes read for operation='");
                    sb.append(str);
                    sb.append("' doesn't match with expected: expected=");
                    sb.append(i);
                    sb.append(", actual=");
                    sb.append(i2);
                    return sb.toString();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, null, false, null);
            return false;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$checkReadExpected$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Unexpected EOF at the operation=".concat(String.valueOf(p2));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, null, false, null);
        return false;
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final byte[] b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, int i) {
            this.b = bArr;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\n\n\u0002\b\t\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/batch/PlainBatchFileReaderWriter$BlockType;", "", "", "p0", "<init>", "(Ljava/lang/String;IS)V", "identifier", ExifInterface.LATITUDE_SOUTH, "getIdentifier", "()S", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    enum BlockType {
        EVENT(0),
        META(1);

        private final short identifier;

        BlockType(short s) {
            this.identifier = s;
        }

        public final short getIdentifier() {
            return this.identifier;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.ImageCaptureCapabilities
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public boolean b(final File p0, ImageCapture p1, boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(p0, p2);
            try {
                FileOutputStream fileOutputStream2 = fileOutputStream;
                FileLock fileLockLock = fileOutputStream2.getChannel().lock();
                Intrinsics.checkNotNullExpressionValue(fileLockLock, "");
                try {
                    byte[] bArr = p1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 6 + p1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length + 6);
                    Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "");
                    ByteBuffer byteBufferPut = byteBufferAllocate.putShort(BlockType.META.getIdentifier()).putInt(bArr.length).put(bArr);
                    Intrinsics.checkNotNullExpressionValue(byteBufferPut, "");
                    BlockType blockType = BlockType.EVENT;
                    byte[] bArr2 = p1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    ByteBuffer byteBufferPut2 = byteBufferPut.putShort(blockType.getIdentifier()).putInt(bArr2.length).put(bArr2);
                    Intrinsics.checkNotNullExpressionValue(byteBufferPut2, "");
                    fileOutputStream2.write(byteBufferPut2.array());
                    Unit unit = Unit.INSTANCE;
                    fileLockLock.release();
                    Unit unit2 = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, null);
                    return true;
                } catch (Throwable th) {
                    fileLockLock.release();
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (IOException e2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$writeData$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "Unable to write data to file: %s", Arrays.copyOf(new Object[]{p0.getPath()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, e2, false, null);
            return false;
        } catch (SecurityException e3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$writeData$2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "Unable to write data to file: %s", Arrays.copyOf(new Object[]{p0.getPath()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, e3, false, null);
            return false;
        }
    }
}
