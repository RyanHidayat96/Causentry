use std::collections::VecDeque;
use std::fs::{self, OpenOptions};
use std::io::Write;
use std::path::PathBuf;
use std::sync::Mutex;
use std::time::{SystemTime, UNIX_EPOCH};

const MAX_MEMORY_LINES: usize = 200;
const MAX_FILE_BYTES: u64 = 512 * 1024;

pub struct RingLog {
    path: PathBuf,
    lines: Mutex<VecDeque<String>>,
}

impl RingLog {
    pub fn new(path: PathBuf) -> Self {
        let mut initial = VecDeque::with_capacity(MAX_MEMORY_LINES);
        if let Ok(existing) = fs::read_to_string(&path) {
            for line in existing.lines().rev().take(60).collect::<Vec<_>>().into_iter().rev() {
                initial.push_back(line.to_string());
            }
        }
        Self {
            path,
            lines: Mutex::new(initial),
        }
    }

    pub fn info(&self, msg: &str) {
        let secs = SystemTime::now()
            .duration_since(UNIX_EPOCH)
            .map(|d| d.as_secs())
            .unwrap_or(0);
        let h = (secs / 3600) % 24;
        let m = (secs / 60) % 60;
        let s = secs % 60;
        let formatted = format!("{h:02}:{m:02}:{s:02} [causentryd] {msg}");

        if let Ok(mut guard) = self.lines.lock() {
            if guard.len() >= MAX_MEMORY_LINES {
                guard.pop_front();
            }
            guard.push_back(formatted.clone());
        }

        if let Some(parent) = self.path.parent() {
            let _ = fs::create_dir_all(parent);
        }
        if let Ok(meta) = fs::metadata(&self.path)
            && meta.len() > MAX_FILE_BYTES
        {
            let rotated = self.path.with_extension("log.old");
            let _ = fs::rename(&self.path, rotated);
        }
        if let Ok(mut file) = OpenOptions::new().create(true).append(true).open(&self.path) {
            let _ = writeln!(file, "{formatted}");
        }
    }

    pub fn tail(&self, count: usize) -> String {
        let Ok(guard) = self.lines.lock() else {
            return String::new();
        };
        let skip = guard.len().saturating_sub(count);
        guard
            .iter()
            .skip(skip)
            .cloned()
            .collect::<Vec<_>>()
            .join("\n")
    }
}

