@echo off
REM Causentry - double-click launcher for build-causentry.ps1
REM Examples:  build-causentry.cmd -Deploy   |   build-causentry.cmd -NoApk
cd /d "%~dp0"
powershell -NoProfile -ExecutionPolicy Bypass -File "%~dp0build-causentry.ps1" %* -Pause
