package androidx.room.concurrent;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/room/concurrent/FileLock;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "lock", "()V", "unlock", "lockFilename", "Ljava/lang/String;", "Ljava/nio/channels/FileChannel;", "lockChannel", "Ljava/nio/channels/FileChannel;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FileLock {
    private FileChannel lockChannel;
    private final String lockFilename;

    public FileLock(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".lck");
        this.lockFilename = sb.toString();
    }

    public final void lock() throws IOException {
        if (this.lockChannel == null) {
            try {
                File file = new File(this.lockFilename);
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                this.lockChannel = channel;
                if (channel != null) {
                    channel.lock();
                }
            } catch (Throwable th) {
                FileChannel fileChannel = this.lockChannel;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                this.lockChannel = null;
                StringBuilder sb = new StringBuilder("Unable to lock file: '");
                sb.append(this.lockFilename);
                sb.append("'.");
                throw new IllegalStateException(sb.toString(), th);
            }
        }
    }

    public final void unlock() {
        FileChannel fileChannel = this.lockChannel;
        if (fileChannel == null) {
            return;
        }
        try {
            fileChannel.close();
        } finally {
            this.lockChannel = null;
        }
    }
}
