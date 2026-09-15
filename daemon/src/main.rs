use std::process::ExitCode;

use causentryd::version_line;

fn main() -> ExitCode {
    let mut args = std::env::args().skip(1);

    match args.next().as_deref() {
        Some("--version") | Some("-V") => {
            println!("{}", version_line());
            ExitCode::SUCCESS
        }
        Some("--help") | Some("-h") => {
            println!("causentryd");
            println!();
            println!("Usage:");
            println!("  causentryd --version");
            ExitCode::SUCCESS
        }
        Some(arg) => {
            eprintln!("unknown argument: {arg}");
            ExitCode::from(2)
        }
        None => {
            println!("{}", version_line());
            ExitCode::SUCCESS
        }
    }
}
