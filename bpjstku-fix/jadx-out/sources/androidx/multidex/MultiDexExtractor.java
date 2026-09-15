package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes.dex */
final class MultiDexExtractor implements Closeable {
    private static final int BUFFER_SIZE = 16384;
    private static final String DEX_PREFIX = "classes";
    static final String DEX_SUFFIX = ".dex";
    private static final String EXTRACTED_NAME_EXT = ".classes";
    static final String EXTRACTED_SUFFIX = ".zip";
    private static final String KEY_CRC = "crc";
    private static final String KEY_DEX_CRC = "dex.crc.";
    private static final String KEY_DEX_NUMBER = "dex.number";
    private static final String KEY_DEX_TIME = "dex.time.";
    private static final String KEY_TIME_STAMP = "timestamp";
    private static final String LOCK_FILENAME = "MultiDex.lock";
    private static final int MAX_EXTRACT_ATTEMPTS = 3;
    private static final long NO_VALUE = -1;
    private static final String PREFS_FILE = "multidex.version";
    private static final String TAG = "MultiDex";
    private final FileLock cacheLock;
    private final File dexDir;
    private final FileChannel lockChannel;
    private final RandomAccessFile lockRaf;
    private final File sourceApk;
    private final long sourceCrc;

    static class ExtractedDex extends File {
        public long crc;

        public ExtractedDex(File file, String str) {
            super(file, str);
            this.crc = -1L;
        }
    }

    MultiDexExtractor(File file, File file2) throws IOException {
        file.getPath();
        file2.getPath();
        this.sourceApk = file;
        this.dexDir = file2;
        this.sourceCrc = getZipCrc(file);
        File file3 = new File(file2, LOCK_FILENAME);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.lockRaf = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.lockChannel = channel;
            try {
                file3.getPath();
                this.cacheLock = channel.lock();
                file3.getPath();
            } catch (IOException e2) {
                e = e2;
                closeQuietly(this.lockChannel);
                throw e;
            } catch (Error e3) {
                e = e3;
                closeQuietly(this.lockChannel);
                throw e;
            } catch (RuntimeException e4) {
                e = e4;
                closeQuietly(this.lockChannel);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e5) {
            closeQuietly(this.lockRaf);
            throw e5;
        }
    }

    final List<? extends File> load(Context context, String str, boolean z) throws IOException {
        List<ExtractedDex> listLoadExistingExtractions;
        this.sourceApk.getPath();
        if (!this.cacheLock.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z && !isModified(context, this.sourceApk, this.sourceCrc, str)) {
            try {
                listLoadExistingExtractions = loadExistingExtractions(context, str);
            } catch (IOException unused) {
                List<ExtractedDex> listPerformExtractions = performExtractions();
                putStoredApkInfo(context, str, getTimeStamp(this.sourceApk), this.sourceCrc, listPerformExtractions);
                listLoadExistingExtractions = listPerformExtractions;
            }
        } else {
            List<ExtractedDex> listPerformExtractions2 = performExtractions();
            putStoredApkInfo(context, str, getTimeStamp(this.sourceApk), this.sourceCrc, listPerformExtractions2);
            listLoadExistingExtractions = listPerformExtractions2;
        }
        listLoadExistingExtractions.size();
        return listLoadExistingExtractions;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.cacheLock.release();
        this.lockChannel.close();
        this.lockRaf.close();
    }

    private List<ExtractedDex> loadExistingExtractions(Context context, String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(this.sourceApk.getName());
        sb.append(EXTRACTED_NAME_EXT);
        String string = sb.toString();
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(KEY_DEX_NUMBER);
        int i = multiDexPreferences.getInt(sb2.toString(), 1);
        ArrayList arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append(i2);
            sb3.append(EXTRACTED_SUFFIX);
            ExtractedDex extractedDex = new ExtractedDex(this.dexDir, sb3.toString());
            if (extractedDex.isFile()) {
                extractedDex.crc = getZipCrc(extractedDex);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(KEY_DEX_CRC);
                sb4.append(i2);
                long j = multiDexPreferences.getLong(sb4.toString(), -1L);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(KEY_DEX_TIME);
                sb5.append(i2);
                long j2 = multiDexPreferences.getLong(sb5.toString(), -1L);
                long jLastModified = extractedDex.lastModified();
                if (j2 == jLastModified) {
                    String str2 = string;
                    SharedPreferences sharedPreferences = multiDexPreferences;
                    if (j == extractedDex.crc) {
                        arrayList.add(extractedDex);
                        i2++;
                        multiDexPreferences = sharedPreferences;
                        string = str2;
                    }
                }
                StringBuilder sb6 = new StringBuilder("Invalid extracted dex: ");
                sb6.append(extractedDex);
                sb6.append(" (key \"");
                sb6.append(str);
                sb6.append("\"), expected modification time: ");
                sb6.append(j2);
                sb6.append(", modification time: ");
                sb6.append(jLastModified);
                sb6.append(", expected crc: ");
                sb6.append(j);
                sb6.append(", file crc: ");
                sb6.append(extractedDex.crc);
                throw new IOException(sb6.toString());
            }
            StringBuilder sb7 = new StringBuilder("Missing extracted secondary dex file '");
            sb7.append(extractedDex.getPath());
            sb7.append("'");
            throw new IOException(sb7.toString());
        }
        return arrayList;
    }

    private static boolean isModified(Context context, File file, long j, String str) {
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(KEY_TIME_STAMP);
        if (multiDexPreferences.getLong(sb.toString(), -1L) != getTimeStamp(file)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(KEY_CRC);
        return multiDexPreferences.getLong(sb2.toString(), -1L) != j;
    }

    private static long getTimeStamp(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    private static long getZipCrc(File file) throws IOException {
        long zipCrc = ZipUtil.getZipCrc(file);
        return zipCrc == -1 ? zipCrc - 1 : zipCrc;
    }

    private List<ExtractedDex> performExtractions() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(this.sourceApk.getName());
        sb.append(EXTRACTED_NAME_EXT);
        String string = sb.toString();
        clearDexDir();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.sourceApk);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i = 2;
            while (entry != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(i);
                sb2.append(EXTRACTED_SUFFIX);
                ExtractedDex extractedDex = new ExtractedDex(this.dexDir, sb2.toString());
                arrayList.add(extractedDex);
                extractedDex.toString();
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    extract(zipFile, entry, extractedDex, string);
                    try {
                        extractedDex.crc = getZipCrc(extractedDex);
                        z = true;
                    } catch (IOException unused) {
                        extractedDex.getAbsolutePath();
                        z = false;
                    }
                    extractedDex.getAbsolutePath();
                    extractedDex.length();
                    long j = extractedDex.crc;
                    if (!z) {
                        extractedDex.delete();
                        if (extractedDex.exists()) {
                            extractedDex.getPath();
                        }
                    }
                }
                if (!z) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Could not create zip file ");
                    sb3.append(extractedDex.getAbsolutePath());
                    sb3.append(" for secondary dex (");
                    sb3.append(i);
                    sb3.append(")");
                    throw new IOException(sb3.toString());
                }
                i++;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(DEX_PREFIX);
                sb4.append(i);
                sb4.append(DEX_SUFFIX);
                entry = zipFile.getEntry(sb4.toString());
            }
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }

    private static void putStoredApkInfo(Context context, String str, long j, long j2, List<ExtractedDex> list) {
        SharedPreferences.Editor editorEdit = getMultiDexPreferences(context).edit();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(KEY_TIME_STAMP);
        editorEdit.putLong(sb.toString(), j);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(KEY_CRC);
        editorEdit.putLong(sb2.toString(), j2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(KEY_DEX_NUMBER);
        editorEdit.putInt(sb3.toString(), list.size() + 1);
        int i = 2;
        for (ExtractedDex extractedDex : list) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(KEY_DEX_CRC);
            sb4.append(i);
            editorEdit.putLong(sb4.toString(), extractedDex.crc);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append(KEY_DEX_TIME);
            sb5.append(i);
            editorEdit.putLong(sb5.toString(), extractedDex.lastModified());
            i++;
        }
        editorEdit.commit();
    }

    private static SharedPreferences getMultiDexPreferences(Context context) {
        return context.getSharedPreferences(PREFS_FILE, 4);
    }

    private void clearDexDir() {
        File[] fileArrListFiles = this.dexDir.listFiles(new FileFilter() { // from class: androidx.multidex.MultiDexExtractor.1
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                return !file.getName().equals(MultiDexExtractor.LOCK_FILENAME);
            }
        });
        if (fileArrListFiles == null) {
            this.dexDir.getPath();
            return;
        }
        for (File file : fileArrListFiles) {
            file.getPath();
            file.length();
            if (!file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }

    private static void extract(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-".concat(String.valueOf(str)), EXTRACTED_SUFFIX, file.getParentFile());
        fileCreateTempFile.getPath();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to mark readonly \"");
                    sb.append(fileCreateTempFile.getAbsolutePath());
                    sb.append("\" (tmp of \"");
                    sb.append(file.getAbsolutePath());
                    sb.append("\")");
                    throw new IOException(sb.toString());
                }
                file.getPath();
                if (!fileCreateTempFile.renameTo(file)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to rename \"");
                    sb2.append(fileCreateTempFile.getAbsolutePath());
                    sb2.append("\" to \"");
                    sb2.append(file.getAbsolutePath());
                    sb2.append("\"");
                    throw new IOException(sb2.toString());
                }
                closeQuietly(inputStream);
                fileCreateTempFile.delete();
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            closeQuietly(inputStream);
            fileCreateTempFile.delete();
            throw th2;
        }
    }

    private static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
