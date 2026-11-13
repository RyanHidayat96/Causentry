@echo off
setlocal EnableExtensions DisableDelayedExpansion

if /I "%~1"=="--help" goto :help
if /I "%~1"=="/help" goto :help
if /I "%~1"=="/?" goto :help

set "CHECK_ONLY=0"
set "FORCE_INSTALL=0"
set "DEVICE_ARG="

:parse_args
if "%~1"=="" goto :args_done
if /I "%~1"=="--check" (
  set "CHECK_ONLY=1"
  shift
  goto :parse_args
)
if /I "%~1"=="--force" (
  set "FORCE_INSTALL=1"
  shift
  goto :parse_args
)
if not defined DEVICE_ARG (
  set "DEVICE_ARG=%~1"
)
shift
goto :parse_args

:args_done

set "ROOT=%~dp0"
call :find_adb || exit /b 1
call :select_device "%DEVICE_ARG%" || exit /b 1
if "%CHECK_ONLY%"=="1" (
  echo Device detected: %SERIAL%
  exit /b 0
)

echo Building latest Causentry APK...
powershell.exe -NoProfile -ExecutionPolicy Bypass -File "%ROOT%scripts\build-causentry.ps1" || exit /b 1

set "APK=%ROOT%root-module\payload\Causentry.apk"
if not exist "%APK%" (
  echo ERROR: APK not found: "%APK%"
  echo Run scripts\build-causentry.ps1 first.
  exit /b 1
)

set "LOCAL_SHA="
for /f "usebackq delims=" %%H in (`powershell.exe -NoProfile -Command "(Get-FileHash -LiteralPath '%APK%' -Algorithm SHA256).Hash.ToLower()"`) do set "LOCAL_SHA=%%H"
if not defined LOCAL_SHA (
  echo ERROR: cannot calculate local APK hash.
  exit /b 1
)

set "REMOTE_APK="
for /f "usebackq delims=" %%P in (`"%ADB%" -s "%SERIAL%" shell "pm path com.causentry.app 2>/dev/null | tr -d '\r' | sed -n 's/^package://p' | head -1"`) do set "REMOTE_APK=%%P"
set "REMOTE_SHA="
if defined REMOTE_APK for /f "tokens=1" %%H in ('"%ADB%" -s "%SERIAL%" shell "sha256sum %REMOTE_APK% 2^>/dev/null ^| tr -d '\r'"') do if not defined REMOTE_SHA set "REMOTE_SHA=%%H"

if "%FORCE_INSTALL%"=="0" if defined REMOTE_SHA if /I "%LOCAL_SHA%"=="%REMOTE_SHA%" (
  echo Device   : %SERIAL%
  echo APK hash : %LOCAL_SHA% (unchanged)
  echo Control UI is already up to date. Nothing installed.
  exit /b 0
)

echo Device : %SERIAL%
if defined REMOTE_SHA (
  echo Local  SHA : %LOCAL_SHA%
  echo Remote SHA : %REMOTE_SHA%
  echo APK changed. Installing update...
) else (
  echo Causentry app not installed on device. Installing fresh APK...
)
"%ADB%" -s "%SERIAL%" install -r "%APK%" || exit /b 1
echo APK installed successfully. Device not restarted.
echo Launching Causentry UI on device...
"%ADB%" -s "%SERIAL%" shell "am start -n com.causentry.app/.MainActivity" >nul 2>&1
exit /b 0

:find_adb
set "ADB="
for /f "usebackq delims=" %%A in (`where adb.exe 2^>nul`) do if not defined ADB set "ADB=%%A"
if not defined ADB if defined ANDROID_SDK_ROOT if exist "%ANDROID_SDK_ROOT%\platform-tools\adb.exe" set "ADB=%ANDROID_SDK_ROOT%\platform-tools\adb.exe"
if not defined ADB if defined ANDROID_HOME if exist "%ANDROID_HOME%\platform-tools\adb.exe" set "ADB=%ANDROID_HOME%\platform-tools\adb.exe"
if defined ADB exit /b 0
echo ERROR: adb.exe not found. Add platform-tools to PATH or set ANDROID_SDK_ROOT.
exit /b 1

:select_device
set "SERIAL=%~1"
if defined SERIAL (
  "%ADB%" -s "%SERIAL%" get-state 1>nul 2>nul || (
    echo ERROR: device "%SERIAL%" is not connected and authorized.
    exit /b 1
  )
  exit /b 0
)

set "FOUND="
set /a COUNT=0
for /f "tokens=1,2" %%A in ('"%ADB%" devices') do (
  if "%%B"=="device" (
    set "FOUND=%%A"
    set /a COUNT+=1
  )
)
if %COUNT% EQU 1 (
  set "SERIAL=%FOUND%"
  exit /b 0
)
if %COUNT% EQU 0 (
  echo ERROR: no authorized Android device connected.
) else (
  echo ERROR: multiple devices connected. Run with device serial as first argument.
)
exit /b 1

:help
echo Usage: %~nx0 [device-serial] [--force] [--check]
echo.
echo Builds source, compares root-module\payload\Causentry.apk with installed com.causentry.app,
echo and installs only when hash differs (or when --force is given).
echo Automatically launches Causentry UI on device after install.
echo Works universally on Magisk, KernelSU, APatch, and unrooted dev setups.
exit /b 0
