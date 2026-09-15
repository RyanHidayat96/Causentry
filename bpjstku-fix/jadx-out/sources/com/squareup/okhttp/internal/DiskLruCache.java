package com.squareup.okhttp.internal;

import com.squareup.okhttp.internal.io.FileSystem;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListener;
import defpackage.RotationProviderListenerWrapper;
import defpackage.SurfaceViewImplementation;
import defpackage.SurfaceViewImplementationApi24Impl;
import defpackage.cancelPreviousRequest;
import defpackage.tryToComplete;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class DiskLruCache implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final long ANY_SEQUENCE_NUMBER = -1;
    private static final String CLEAN = "CLEAN";
    private static final String DIRTY = "DIRTY";
    static final String JOURNAL_FILE = "journal";
    static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    static final String JOURNAL_FILE_TEMP = "journal.tmp";
    static final String MAGIC = "libcore.io.DiskLruCache";
    private static final String READ = "READ";
    private static final String REMOVE = "REMOVE";
    static final String VERSION_1 = "1";
    private final int appVersion;
    private boolean closed;
    private final File directory;
    private final Executor executor;
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private RotationProviderListener journalWriter;
    private long maxSize;
    private int redundantOpCount;
    private final int valueCount;
    static final Pattern LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,120}");
    private static final SurfaceViewImplementationApi24Impl NULL_SINK = new SurfaceViewImplementationApi24Impl() { // from class: com.squareup.okhttp.internal.DiskLruCache.4
        @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
        public final void flush() throws IOException {
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl
        public final void write(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
            rotationProviderListenerWrapper.g(j);
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl
        public final cancelPreviousRequest timeout() {
            return cancelPreviousRequest.NONE;
        }
    };
    private long size = 0;
    private final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private long nextSequenceNumber = 0;
    private final Runnable cleanupRunnable = new Runnable() { // from class: com.squareup.okhttp.internal.DiskLruCache.1
        @Override // java.lang.Runnable
        public void run() {
            synchronized (DiskLruCache.this) {
                if ((!DiskLruCache.this.initialized) || DiskLruCache.this.closed) {
                    return;
                }
                try {
                    DiskLruCache.this.trimToSize();
                    if (DiskLruCache.this.journalRebuildRequired()) {
                        DiskLruCache.this.rebuildJournal();
                        DiskLruCache.this.redundantOpCount = 0;
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
    };

    DiskLruCache(FileSystem fileSystem, File file, int i, int i2, long j, Executor executor) {
        this.fileSystem = fileSystem;
        this.directory = file;
        this.appVersion = i;
        this.journalFile = new File(file, JOURNAL_FILE);
        this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
        this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
        this.valueCount = i2;
        this.maxSize = j;
        this.executor = executor;
    }

    public final void initialize() throws IOException {
        synchronized (this) {
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                }
            }
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e2) {
                    Platform platform = Platform.get();
                    StringBuilder sb = new StringBuilder("DiskLruCache ");
                    sb.append(this.directory);
                    sb.append(" is corrupt: ");
                    sb.append(e2.getMessage());
                    sb.append(", removing");
                    platform.logW(sb.toString());
                    delete();
                    this.closed = false;
                }
            }
            rebuildJournal();
            this.initialized = true;
        }
    }

    public static DiskLruCache create(FileSystem fileSystem, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        return new DiskLruCache(fileSystem, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp DiskLruCache", true)));
    }

    private void readJournal() throws IOException {
        RotationProvider1 rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.fileSystem.source(this.journalFile));
        try {
            String strIconCompatParcelizer = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer();
            String strIconCompatParcelizer2 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer();
            String strIconCompatParcelizer3 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer();
            String strIconCompatParcelizer4 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer();
            String strIconCompatParcelizer5 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer();
            if (!MAGIC.equals(strIconCompatParcelizer) || !VERSION_1.equals(strIconCompatParcelizer2) || !Integer.toString(this.appVersion).equals(strIconCompatParcelizer3) || !Integer.toString(this.valueCount).equals(strIconCompatParcelizer4) || !"".equals(strIconCompatParcelizer5)) {
                StringBuilder sb = new StringBuilder("unexpected journal header: [");
                sb.append(strIconCompatParcelizer);
                sb.append(", ");
                sb.append(strIconCompatParcelizer2);
                sb.append(", ");
                sb.append(strIconCompatParcelizer4);
                sb.append(", ");
                sb.append(strIconCompatParcelizer5);
                sb.append("]");
                throw new IOException(sb.toString());
            }
            int i = 0;
            while (true) {
                try {
                    readJournalLine(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer());
                    i++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i - this.lruEntries.size();
                    if (!rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.d()) {
                        rebuildJournal();
                    } else {
                        this.journalWriter = newJournalWriter();
                    }
                    Util.closeQuietly(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    return;
                }
            }
        } catch (Throwable th) {
            Util.closeQuietly(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            throw th;
        }
    }

    private RotationProviderListener newJournalWriter() throws FileNotFoundException {
        return SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile)) { // from class: com.squareup.okhttp.internal.DiskLruCache.2
            static final /* synthetic */ boolean $assertionsDisabled = false;

            @Override // com.squareup.okhttp.internal.FaultHidingSink
            protected void onException(IOException iOException) {
                DiskLruCache.this.hasJournalErrors = true;
            }
        });
    }

    private void readJournalLine(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(String.valueOf(str)));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith(REMOVE)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        Entry entry = this.lruEntries.get(strSubstring);
        if (entry == null) {
            entry = new Entry(strSubstring);
            this.lruEntries.put(strSubstring, entry);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith(CLEAN)) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            entry.readable = true;
            entry.currentEditor = null;
            entry.setLengths(strArrSplit);
            return;
        }
        if (iIndexOf2 != -1 || iIndexOf != 5 || !str.startsWith(DIRTY)) {
            if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith(READ)) {
                throw new IOException("unexpected journal line: ".concat(String.valueOf(str)));
            }
            return;
        }
        entry.currentEditor = new Editor(entry);
    }

    private void processJournal() throws IOException {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            int i = 0;
            if (next.currentEditor == null) {
                while (i < this.valueCount) {
                    this.size += next.lengths[i];
                    i++;
                }
            } else {
                next.currentEditor = null;
                while (i < this.valueCount) {
                    this.fileSystem.delete(next.cleanFiles[i]);
                    this.fileSystem.delete(next.dirtyFiles[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rebuildJournal() throws IOException {
        synchronized (this) {
            try {
                RotationProviderListener rotationProviderListener = this.journalWriter;
                if (rotationProviderListener != null) {
                    rotationProviderListener.close();
                }
                RotationProviderListener rotationProviderListenerTuitionPaymentFragmentbindingInflater1 = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(this.fileSystem.sink(this.journalFileTmp));
                try {
                    rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(MAGIC).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                    rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(VERSION_1).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                    rotationProviderListenerTuitionPaymentFragmentbindingInflater1.a(this.appVersion).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                    rotationProviderListenerTuitionPaymentFragmentbindingInflater1.a(this.valueCount).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                    rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                    for (Entry entry : this.lruEntries.values()) {
                        if (entry.currentEditor != null) {
                            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DIRTY).TuitionPaymentFragmentspecialinlinedviewModeldefault3(32);
                            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(entry.key);
                            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                        } else {
                            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CLEAN).TuitionPaymentFragmentspecialinlinedviewModeldefault3(32);
                            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(entry.key);
                            entry.writeLengths(rotationProviderListenerTuitionPaymentFragmentbindingInflater1);
                            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                        }
                    }
                    rotationProviderListenerTuitionPaymentFragmentbindingInflater1.close();
                    if (this.fileSystem.exists(this.journalFile)) {
                        this.fileSystem.rename(this.journalFile, this.journalFileBackup);
                    }
                    this.fileSystem.rename(this.journalFileTmp, this.journalFile);
                    this.fileSystem.delete(this.journalFileBackup);
                    this.journalWriter = newJournalWriter();
                    this.hasJournalErrors = false;
                } catch (Throwable th) {
                    rotationProviderListenerTuitionPaymentFragmentbindingInflater1.close();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Snapshot get(String str) throws IOException {
        synchronized (this) {
            initialize();
            checkNotClosed();
            validateKey(str);
            Entry entry = this.lruEntries.get(str);
            if (entry != null && entry.readable) {
                Snapshot snapshot = entry.snapshot();
                if (snapshot == null) {
                    return null;
                }
                this.redundantOpCount++;
                this.journalWriter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(READ).TuitionPaymentFragmentspecialinlinedviewModeldefault3(32).TuitionPaymentFragmentspecialinlinedviewModeldefault1(str).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                if (journalRebuildRequired()) {
                    this.executor.execute(this.cleanupRunnable);
                }
                return snapshot;
            }
            return null;
        }
    }

    public final Editor edit(String str) throws IOException {
        return edit(str, -1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Editor edit(String str, long j) throws IOException {
        synchronized (this) {
            initialize();
            checkNotClosed();
            validateKey(str);
            Entry entry = this.lruEntries.get(str);
            if (j != -1 && (entry == null || entry.sequenceNumber != j)) {
                return null;
            }
            if (entry != null && entry.currentEditor != null) {
                return null;
            }
            this.journalWriter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DIRTY).TuitionPaymentFragmentspecialinlinedviewModeldefault3(32).TuitionPaymentFragmentspecialinlinedviewModeldefault1(str).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
            this.journalWriter.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(str);
                this.lruEntries.put(str, entry);
            }
            Editor editor = new Editor(entry);
            entry.currentEditor = editor;
            return editor;
        }
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final long getMaxSize() {
        long j;
        synchronized (this) {
            j = this.maxSize;
        }
        return j;
    }

    public final void setMaxSize(long j) {
        synchronized (this) {
            this.maxSize = j;
            if (this.initialized) {
                this.executor.execute(this.cleanupRunnable);
            }
        }
    }

    public final long size() throws IOException {
        long j;
        synchronized (this) {
            initialize();
            j = this.size;
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeEdit(Editor editor, boolean z) throws IOException {
        synchronized (this) {
            Entry entry = editor.entry;
            if (entry.currentEditor != editor) {
                throw new IllegalStateException();
            }
            if (z && !entry.readable) {
                for (int i = 0; i < this.valueCount; i++) {
                    if (!editor.written[i]) {
                        editor.abort();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Newly created entry didn't create value for index ");
                        sb.append(i);
                        throw new IllegalStateException(sb.toString());
                    }
                    if (!this.fileSystem.exists(entry.dirtyFiles[i])) {
                        editor.abort();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.valueCount; i2++) {
                File file = entry.dirtyFiles[i2];
                if (z) {
                    if (this.fileSystem.exists(file)) {
                        File file2 = entry.cleanFiles[i2];
                        this.fileSystem.rename(file, file2);
                        long j = entry.lengths[i2];
                        long size = this.fileSystem.size(file2);
                        entry.lengths[i2] = size;
                        this.size = (this.size - j) + size;
                    }
                } else {
                    this.fileSystem.delete(file);
                }
            }
            this.redundantOpCount++;
            entry.currentEditor = null;
            if (entry.readable | z) {
                entry.readable = true;
                this.journalWriter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CLEAN).TuitionPaymentFragmentspecialinlinedviewModeldefault3(32);
                this.journalWriter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(entry.key);
                entry.writeLengths(this.journalWriter);
                this.journalWriter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                if (z) {
                    long j2 = this.nextSequenceNumber;
                    this.nextSequenceNumber = 1 + j2;
                    entry.sequenceNumber = j2;
                }
            } else {
                this.lruEntries.remove(entry.key);
                this.journalWriter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(REMOVE).TuitionPaymentFragmentspecialinlinedviewModeldefault3(32);
                this.journalWriter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(entry.key);
                this.journalWriter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
            }
            this.journalWriter.flush();
            if (this.size > this.maxSize || journalRebuildRequired()) {
                this.executor.execute(this.cleanupRunnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    public final boolean remove(String str) throws IOException {
        synchronized (this) {
            initialize();
            checkNotClosed();
            validateKey(str);
            Entry entry = this.lruEntries.get(str);
            if (entry == null) {
                return false;
            }
            return removeEntry(entry);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean removeEntry(Entry entry) throws IOException {
        if (entry.currentEditor != null) {
            entry.currentEditor.hasErrors = true;
        }
        for (int i = 0; i < this.valueCount; i++) {
            this.fileSystem.delete(entry.cleanFiles[i]);
            this.size -= entry.lengths[i];
            entry.lengths[i] = 0;
        }
        this.redundantOpCount++;
        this.journalWriter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(REMOVE).TuitionPaymentFragmentspecialinlinedviewModeldefault3(32).TuitionPaymentFragmentspecialinlinedviewModeldefault1(entry.key).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
        this.lruEntries.remove(entry.key);
        if (journalRebuildRequired()) {
            this.executor.execute(this.cleanupRunnable);
        }
        return true;
    }

    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.closed;
        }
        return z;
    }

    private void checkNotClosed() {
        synchronized (this) {
            if (isClosed()) {
                throw new IllegalStateException("cache is closed");
            }
        }
    }

    public final void flush() throws IOException {
        synchronized (this) {
            if (this.initialized) {
                checkNotClosed();
                trimToSize();
                this.journalWriter.flush();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            if (this.initialized && !this.closed) {
                for (Entry entry : (Entry[]) this.lruEntries.values().toArray(new Entry[this.lruEntries.size()])) {
                    if (entry.currentEditor != null) {
                        entry.currentEditor.abort();
                    }
                }
                trimToSize();
                this.journalWriter.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            removeEntry(this.lruEntries.values().iterator().next());
        }
    }

    public final void delete() throws IOException {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final void evictAll() throws IOException {
        synchronized (this) {
            initialize();
            for (Entry entry : (Entry[]) this.lruEntries.values().toArray(new Entry[this.lruEntries.size()])) {
                removeEntry(entry);
            }
        }
    }

    private void validateKey(String str) {
        if (LEGAL_KEY_PATTERN.matcher(str).matches()) {
            return;
        }
        StringBuilder sb = new StringBuilder("keys must match regex [a-z0-9_-]{1,120}: \"");
        sb.append(str);
        sb.append("\"");
        throw new IllegalArgumentException(sb.toString());
    }

    public final Iterator<Snapshot> snapshots() throws IOException {
        Iterator<Snapshot> it;
        synchronized (this) {
            initialize();
            it = new Iterator<Snapshot>() { // from class: com.squareup.okhttp.internal.DiskLruCache.3
                final Iterator<Entry> delegate;
                Snapshot nextSnapshot;
                Snapshot removeSnapshot;

                {
                    this.delegate = new ArrayList(DiskLruCache.this.lruEntries.values()).iterator();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    if (this.nextSnapshot != null) {
                        return true;
                    }
                    synchronized (DiskLruCache.this) {
                        if (DiskLruCache.this.closed) {
                            return false;
                        }
                        while (this.delegate.hasNext()) {
                            Snapshot snapshot = this.delegate.next().snapshot();
                            if (snapshot != null) {
                                this.nextSnapshot = snapshot;
                                return true;
                            }
                        }
                        return false;
                    }
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.Iterator
                public Snapshot next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    Snapshot snapshot = this.nextSnapshot;
                    this.removeSnapshot = snapshot;
                    this.nextSnapshot = null;
                    return snapshot;
                }

                @Override // java.util.Iterator
                public void remove() {
                    Snapshot snapshot = this.removeSnapshot;
                    if (snapshot == null) {
                        throw new IllegalStateException("remove() before next()");
                    }
                    try {
                        DiskLruCache.this.remove(snapshot.key);
                    } catch (IOException unused) {
                    } finally {
                        this.removeSnapshot = null;
                    }
                }
            };
        }
        return it;
    }

    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final tryToComplete[] sources;

        private Snapshot(String str, long j, tryToComplete[] trytocompleteArr, long[] jArr) {
            this.key = str;
            this.sequenceNumber = j;
            this.sources = trytocompleteArr;
            this.lengths = jArr;
        }

        public final String key() {
            return this.key;
        }

        public final Editor edit() throws IOException {
            return DiskLruCache.this.edit(this.key, this.sequenceNumber);
        }

        public final tryToComplete getSource(int i) {
            return this.sources[i];
        }

        public final long getLength(int i) {
            return this.lengths[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (tryToComplete trytocomplete : this.sources) {
                Util.closeQuietly(trytocomplete);
            }
        }
    }

    public final class Editor {
        private boolean committed;
        private final Entry entry;
        private boolean hasErrors;
        private final boolean[] written;

        private Editor(Entry entry) {
            this.entry = entry;
            this.written = entry.readable ? null : new boolean[DiskLruCache.this.valueCount];
        }

        public final tryToComplete newSource(int i) throws IOException {
            synchronized (DiskLruCache.this) {
                if (this.entry.currentEditor != this) {
                    throw new IllegalStateException();
                }
                if (!this.entry.readable) {
                    return null;
                }
                try {
                    return DiskLruCache.this.fileSystem.source(this.entry.cleanFiles[i]);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        public final SurfaceViewImplementationApi24Impl newSink(int i) throws IOException {
            FaultHidingSink faultHidingSink;
            synchronized (DiskLruCache.this) {
                if (this.entry.currentEditor != this) {
                    throw new IllegalStateException();
                }
                if (!this.entry.readable) {
                    this.written[i] = true;
                }
                try {
                    faultHidingSink = new FaultHidingSink(DiskLruCache.this.fileSystem.sink(this.entry.dirtyFiles[i])) { // from class: com.squareup.okhttp.internal.DiskLruCache.Editor.1
                        @Override // com.squareup.okhttp.internal.FaultHidingSink
                        protected void onException(IOException iOException) {
                            synchronized (DiskLruCache.this) {
                                Editor.this.hasErrors = true;
                            }
                        }
                    };
                } catch (FileNotFoundException unused) {
                    return DiskLruCache.NULL_SINK;
                }
            }
            return faultHidingSink;
        }

        public final void commit() throws IOException {
            synchronized (DiskLruCache.this) {
                if (this.hasErrors) {
                    DiskLruCache.this.completeEdit(this, false);
                    DiskLruCache.this.removeEntry(this.entry);
                } else {
                    DiskLruCache.this.completeEdit(this, true);
                }
                this.committed = true;
            }
        }

        public final void abort() throws IOException {
            synchronized (DiskLruCache.this) {
                DiskLruCache.this.completeEdit(this, false);
            }
        }

        public final void abortUnlessCommitted() {
            synchronized (DiskLruCache.this) {
                if (!this.committed) {
                    try {
                        DiskLruCache.this.completeEdit(this, false);
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    final class Entry {
        private final File[] cleanFiles;
        private Editor currentEditor;
        private final File[] dirtyFiles;
        private final String key;
        private final long[] lengths;
        private boolean readable;
        private long sequenceNumber;

        private Entry(String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.valueCount];
            this.cleanFiles = new File[DiskLruCache.this.valueCount];
            this.dirtyFiles = new File[DiskLruCache.this.valueCount];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < DiskLruCache.this.valueCount; i++) {
                sb.append(i);
                this.cleanFiles[i] = new File(DiskLruCache.this.directory, sb.toString());
                sb.append(".tmp");
                this.dirtyFiles[i] = new File(DiskLruCache.this.directory, sb.toString());
                sb.setLength(length);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLengths(String[] strArr) throws IOException {
            if (strArr.length != DiskLruCache.this.valueCount) {
                throw invalidLengths(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.lengths[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw invalidLengths(strArr);
                }
            }
        }

        final void writeLengths(RotationProviderListener rotationProviderListener) throws IOException {
            for (long j : this.lengths) {
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(32).a(j);
            }
        }

        private IOException invalidLengths(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        final Snapshot snapshot() {
            tryToComplete trytocomplete;
            if (Thread.holdsLock(DiskLruCache.this)) {
                tryToComplete[] trytocompleteArr = new tryToComplete[DiskLruCache.this.valueCount];
                long[] jArr = (long[]) this.lengths.clone();
                for (int i = 0; i < DiskLruCache.this.valueCount; i++) {
                    try {
                        trytocompleteArr[i] = DiskLruCache.this.fileSystem.source(this.cleanFiles[i]);
                    } catch (FileNotFoundException unused) {
                        for (int i2 = 0; i2 < DiskLruCache.this.valueCount && (trytocomplete = trytocompleteArr[i2]) != null; i2++) {
                            Util.closeQuietly(trytocomplete);
                        }
                        return null;
                    }
                }
                return new Snapshot(this.key, this.sequenceNumber, trytocompleteArr, jArr);
            }
            throw new AssertionError();
        }
    }
}
