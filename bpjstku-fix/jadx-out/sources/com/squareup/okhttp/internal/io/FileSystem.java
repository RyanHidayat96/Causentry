package com.squareup.okhttp.internal.io;

import defpackage.SurfaceViewImplementation;
import defpackage.SurfaceViewImplementationApi24Impl;
import defpackage.tryToComplete;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public interface FileSystem {
    public static final FileSystem SYSTEM = new FileSystem() { // from class: com.squareup.okhttp.internal.io.FileSystem.1
        @Override // com.squareup.okhttp.internal.io.FileSystem
        public final tryToComplete source(File file) throws FileNotFoundException {
            return SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file);
        }

        @Override // com.squareup.okhttp.internal.io.FileSystem
        public final SurfaceViewImplementationApi24Impl sink(File file) throws FileNotFoundException {
            try {
                return SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(file);
            }
        }

        @Override // com.squareup.okhttp.internal.io.FileSystem
        public final SurfaceViewImplementationApi24Impl appendingSink(File file) throws FileNotFoundException {
            try {
                return SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault1(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault1(file);
            }
        }

        @Override // com.squareup.okhttp.internal.io.FileSystem
        public final void delete(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete ".concat(String.valueOf(file)));
            }
        }

        @Override // com.squareup.okhttp.internal.io.FileSystem
        public final boolean exists(File file) throws IOException {
            return file.exists();
        }

        @Override // com.squareup.okhttp.internal.io.FileSystem
        public final long size(File file) {
            return file.length();
        }

        @Override // com.squareup.okhttp.internal.io.FileSystem
        public final void rename(File file, File file2) throws IOException {
            delete(file2);
            if (file.renameTo(file2)) {
                return;
            }
            StringBuilder sb = new StringBuilder("failed to rename ");
            sb.append(file);
            sb.append(" to ");
            sb.append(file2);
            throw new IOException(sb.toString());
        }

        @Override // com.squareup.okhttp.internal.io.FileSystem
        public final void deleteContents(File file) throws IOException {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    deleteContents(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(file2)));
                }
            }
        }
    };

    SurfaceViewImplementationApi24Impl appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file) throws IOException;

    void rename(File file, File file2) throws IOException;

    SurfaceViewImplementationApi24Impl sink(File file) throws FileNotFoundException;

    long size(File file);

    tryToComplete source(File file) throws FileNotFoundException;
}
