#include <android/log.h>
#include <cstdarg>
#include <cstdio>
#include <cstring>
#include <sys/stat.h>
#include <string>
#include <unistd.h>

#include "zygisk.hpp"

// Causentry - Zygisk backend (no LSPosed needed).
//
// The system-side hooks (package cloaking, app-ops cloaking, settings cloaking and the
// app-zygote denial) have to live inside system_server. LSPosed/Vector can host them, but
// this native module is the dependency-free path: Zygisk loads the shared object into
// system_server and LSPlant performs the Java method hooks from C++.
//
// Stage 1 (this file): prove the injection path. The module enters system_server
// through the server-specialize callbacks, reads the daemon-written config and
// reports what it sees. Stage 2 adds the LSPlant hooks.

#define LOG_TAG "CausentryZygisk"

static void logi(const char *fmt, ...) {
    va_list ap;
    va_start(ap, fmt);
    __android_log_vprint(ANDROID_LOG_INFO, LOG_TAG, fmt, ap);
    va_end(ap);
}

static const char *CONFIG_PATHS[] = {
        "/data/system/causentry/cloak.json",
        "/data/local/tmp/causentry/cloak.json",
};

static std::string readConfig() {
    for (const char *path : CONFIG_PATHS) {
        FILE *f = fopen(path, "re");
        if (f == nullptr) continue;
        std::string out;
        char buf[512];
        size_t n;
        while ((n = fread(buf, 1, sizeof(buf), f)) > 0) out.append(buf, n);
        fclose(f);
        logi("config read from %s (%zu bytes)", path, out.size());
        return out;
    }
    logi("no readable cloak.json");
    return {};
}

static void writeLoadedMarker() {
    mkdir("/data/system/causentry", 0700);
    FILE *f = fopen("/data/system/causentry/zygisk.loaded", "w");
    if (f == nullptr) {
        logi("failed to write zygisk.loaded");
        return;
    }
    fprintf(f, "%d\n", getpid());
    fclose(f);
    chmod("/data/system/causentry/zygisk.loaded", 0644);
    logi("zygisk.loaded written for system_server pid=%d", getpid());
}

class CausentryZygisk : public zygisk::ModuleBase {
public:
    void onLoad(zygisk::Api *api, JNIEnv *env) override {
        this->api = api;
        this->env = env;
        logi("onLoad: module handle ready");
    }

    void preAppSpecialize(zygisk::AppSpecializeArgs *args) override {
        const char *nice = args->nice_name ? env->GetStringUTFChars(args->nice_name, nullptr) : nullptr;
        process_name = nice ? nice : "";
        if (nice) env->ReleaseStringUTFChars(args->nice_name, nice);
        if (process_name == "system_server") {
            is_system_server = true;
            logi("preAppSpecialize fallback: process=system_server");
            return;
        }
        is_system_server = false;
        if (api != nullptr) api->setOption(zygisk::DLCLOSE_MODULE_LIBRARY);
    }

    void postAppSpecialize(const zygisk::AppSpecializeArgs *) override {
        if (is_system_server) reportSystemServer();
    }

    void preServerSpecialize(zygisk::ServerSpecializeArgs *) override {
        process_name = "system_server";
        is_system_server = true;
        logi("preServerSpecialize: process=system_server");
    }

    void postServerSpecialize(const zygisk::ServerSpecializeArgs *) override {
        reportSystemServer();
    }

private:
    void reportSystemServer() {
        if (!is_system_server) return;
        std::string cfg = readConfig();
        writeLoadedMarker();
        logi("injected into system_server (config %zu bytes, targets json present: %s)",
             cfg.size(), cfg.find("\"targets\"") != std::string::npos ? "yes" : "no");
        // stage 2: LSPlant hooks - package cloaking, app-ops, settings, app-zygote denial
    }

    zygisk::Api *api = nullptr;
    JNIEnv *env = nullptr;
    std::string process_name;
    bool is_system_server = false;
};

REGISTER_ZYGISK_MODULE(CausentryZygisk)
