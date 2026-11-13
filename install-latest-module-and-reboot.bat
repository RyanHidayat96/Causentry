@echo off
setlocal EnableExtensions DisableDelayedExpansion

if /I "%~1"=="--help" goto :help
if /I "%~1"=="/help" goto :help
if /I "%~1"=="/?" goto :help

set "CHECK_ONLY=0"
set "DRY_RUN=0"
set "DO_REBOOT=0"
set "DO_FLASH=0"
set "DEVICE_ARG="

:parse_args
if "%~1"=="" goto :args_done
if /I "%~1"=="--check" (
  set "CHECK_ONLY=1"
  shift
  goto :parse_args
)
if /I "%~1"=="--dry-run" (
  set "DRY_RUN=1"
  shift
  goto :parse_args
)
if /I "%~1"=="--reboot" (
  set "DO_REBOOT=1"
  set "DO_FLASH=1"
  shift
  goto :parse_args
)
if /I "%~1"=="--flash" (
  set "DO_FLASH=1"
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

if "%DRY_RUN%"=="0" (
  echo Building latest Causentry module...
  powershell.exe -NoProfile -ExecutionPolicy Bypass -File "%ROOT%scripts\build-causentry.ps1" || exit /b 1
)

set "ZIP="
for /f "delims=" %%F in ('dir /b /a-d /o-d "%ROOT%release\Causentry-*.zip" 2^>nul') do if not defined ZIP set "ZIP=%ROOT%release\%%F"
if not defined ZIP (
  echo ERROR: no Causentry-*.zip found in "%ROOT%release".
  exit /b 1
)

echo Device : %SERIAL%
echo ZIP    : %ZIP%
if "%DRY_RUN%"=="1" (
  echo Dry run complete. Nothing installed; device not restarted.
  exit /b 0
)

for %%I in ("%ZIP%") do set "ZIP_NAME=%%~nxI"
"%ADB%" -s "%SERIAL%" push "%ZIP%" "/sdcard/Download/%ZIP_NAME%" || exit /b 1
echo ZIP copied to /sdcard/Download/%ZIP_NAME%.

if "%DO_FLASH%"=="1" (
  echo Detecting root manager on device...
  set "ROOT_TYPE=UNKNOWN"
  for /f "usebackq tokens=*" %%T in (`"%ADB%" -s "%SERIAL%" shell "su -c 'if [ -x /data/adb/ksu/bin/ksud ]; then echo KSU; elif [ -x /data/adb/ap/bin/apd ]; then echo APATCH; elif command -v magisk >/dev/null 2>&1 || [ -x /data/adb/magisk/magisk ]; then echo MAGISK; else echo UNKNOWN; fi' 2>/dev/null | tr -d '\r'"`) do set "ROOT_TYPE=%%T"

  echo Root Manager detected: %ROOT_TYPE%
  if "%ROOT_TYPE%"=="KSU" (
    echo Flashing module via KernelSU ksud...
    "%ADB%" -s "%SERIAL%" shell "su -c '/data/adb/ksu/bin/ksud module install /sdcard/Download/%ZIP_NAME%'"
  ) else if "%ROOT_TYPE%"=="APATCH" (
    echo Flashing module via APatch apd...
    "%ADB%" -s "%SERIAL%" shell "su -c '/data/adb/ap/bin/apd module install /sdcard/Download/%ZIP_NAME%'"
  ) else if "%ROOT_TYPE%"=="MAGISK" (
    echo Flashing module via Magisk CLI...
    "%ADB%" -s "%SERIAL%" shell "su -c 'magisk --install-module /sdcard/Download/%ZIP_NAME%'"
  ) else (
    echo Notice: Automatic CLI flashing not available for this root setup.
    echo Please install manually via Magisk / KernelSU / APatch Manager.
  )

  if "%DO_REBOOT%"=="1" (
    echo Rebooting device into system...
    "%ADB%" -s "%SERIAL%" reboot
    echo Device is restarting.
    exit /b 0
  ) else (
    echo Module installed. Reboot device when ready to activate Zygisk hooks.
    exit /b 0
  )
)

echo.
echo Manual Install Instructions:
echo  - Magisk   : Magisk Manager -^> Modules -^> Install from storage -^> Download/%ZIP_NAME%
echo  - KernelSU : KernelSU Manager -^> Modules -^> Install from storage -^> Download/%ZIP_NAME%
echo  - APatch   : APatch Manager -^> Modules -^> Install -^> Download/%ZIP_NAME%
echo.
echo Device was NOT restarted (run with --reboot or --flash to automate).
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
echo Usage: %~nx0 [device-serial] [--flash] [--reboot] [--dry-run] [--check]
echo.
echo Builds source and copies the latest release\Causentry-*.zip to /sdcard/Download/.
echo Options:
echo   --flash    Detects root manager (Magisk, KernelSU, APatch) and flashes module via CLI.
echo   --reboot   Flashes module and immediately restarts device into system.
echo   --dry-run  Builds source and inspects device without copying or flashing.
echo   --check    Quickly verifies ADB authorization status of connected device.
echo Works universally on Magisk, KernelSU, KernelSU-Next, and APatch.
exit /b 0
