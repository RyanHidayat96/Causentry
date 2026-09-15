pub const PRODUCT_NAME: &str = "Causentry";
pub const DAEMON_NAME: &str = "causentryd";
pub const VERSION: &str = env!("CARGO_PKG_VERSION");

pub fn version_line() -> String {
    format!("{DAEMON_NAME} {VERSION}")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn version_line_contains_daemon_name() {
        assert!(version_line().starts_with(DAEMON_NAME));
    }
}
