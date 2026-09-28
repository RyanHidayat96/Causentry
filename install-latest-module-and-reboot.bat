@echo off
setlocal EnableExtensions DisableDelayedExpansion

if /I "%~1"=="--help" goto :help
if /I "%~1"=="/help" goto :help
if /I "%~1"=="/?" goto :help

set "CHECK_ONLY=0"
set "DRY_RUN=0"
set "DEVICE_ARG=%~1"
if /I "%~1"=="--check" (
  set "CHECK_ONLY=1"
  set "DEVICE_ARG=%~2"
)
if /I "%~1"=="--dry-run" (
  set "DRY_RUN=1"
  set "DEVICE_ARG=%~2"
)

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
for /f "delims=" %%F in ('dir /b /a-d /o-d "%ROOT%release\Causentry-KSUN-v*.zip" 2^>nul') do if not defined ZIP set "ZIP=%ROOT%release\%%F"
if not defined ZIP (
  echo ERROR: no Causentry-KSUN-v*.zip found in "%ROOT%release".
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
echo Nothing installed; device not restarted.
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
echo Usage: %~nx0 [device-serial]
echo        %~nx0 --check [device-serial]
echo        %~nx0 --dry-run [device-serial]
echo Builds source, then copies newest release\Causentry-KSUN-v*.zip to device Download. No install or reboot.
exit /b 0
