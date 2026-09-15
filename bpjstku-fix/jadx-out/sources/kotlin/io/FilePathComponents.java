package kotlin.io;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÇ\u0003¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÁ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0011\u0010 \u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010!\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b#\u0010\u0015"}, d2 = {"Lkotlin/io/FilePathComponents;", "", "Ljava/io/File;", "p0", "", "p1", "<init>", "(Ljava/io/File;Ljava/util/List;)V", "", "subPath", "(II)Ljava/io/File;", "component1", "()Ljava/io/File;", "component2", "()Ljava/util/List;", "copy$kotlin_stdlib", "(Ljava/io/File;Ljava/util/List;)Lkotlin/io/FilePathComponents;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "root", "Ljava/io/File;", "getRoot", "segments", "Ljava/util/List;", "getSegments", "getRootName", "rootName", "isRooted", "()Z", "getSize", "size"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FilePathComponents {
    private final File root;
    private final List<File> segments;

    /* JADX WARN: Multi-variable type inference failed */
    public FilePathComponents(File file, List<? extends File> list) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.root = file;
        this.segments = list;
    }

    public final File getRoot() {
        return this.root;
    }

    public final List<File> getSegments() {
        return this.segments;
    }

    public final String getRootName() {
        String path = this.root.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "");
        return path;
    }

    public final boolean isRooted() {
        String path = this.root.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "");
        return path.length() > 0;
    }

    public final int getSize() {
        return this.segments.size();
    }

    public final File subPath(int p0, int p1) {
        if (p0 < 0 || p0 > p1 || p1 > getSize()) {
            throw new IllegalArgumentException();
        }
        List<File> listSubList = this.segments.subList(p0, p1);
        String str = File.separator;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return new File(CollectionsKt.joinToString$default(listSubList, str, null, null, 0, null, null, 62, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilePathComponents copy$kotlin_stdlib$default(FilePathComponents filePathComponents, File file, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            file = filePathComponents.root;
        }
        if ((i & 2) != 0) {
            list = filePathComponents.segments;
        }
        return filePathComponents.copy$kotlin_stdlib(file, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final File getRoot() {
        return this.root;
    }

    public final List<File> component2() {
        return this.segments;
    }

    public final FilePathComponents copy$kotlin_stdlib(File p0, List<? extends File> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new FilePathComponents(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof FilePathComponents)) {
            return false;
        }
        FilePathComponents filePathComponents = (FilePathComponents) p0;
        return Intrinsics.areEqual(this.root, filePathComponents.root) && Intrinsics.areEqual(this.segments, filePathComponents.segments);
    }

    public final int hashCode() {
        return (this.root.hashCode() * 31) + this.segments.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilePathComponents(root=");
        sb.append(this.root);
        sb.append(", segments=");
        sb.append(this.segments);
        sb.append(')');
        return sb.toString();
    }
}
