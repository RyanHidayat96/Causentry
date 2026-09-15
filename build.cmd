@echo off
REM Causentry - double-click entry point at the project root.
REM Examples: build.cmd   |   build.cmd -Deploy   |   build.cmd -NoApk
cd /d "%~dp0"
powershell -NoProfile -ExecutionPolicy Bypass -File "%~dp0scripts\build-causentry.ps1" %* -Pause
