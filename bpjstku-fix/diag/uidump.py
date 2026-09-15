import re, sys, subprocess

S = sys.argv[1] if len(sys.argv) > 1 else '6a0706f0'
BASE = r'C:/Users/exery/Documents/tools/Causentry/bpjstku-fix/diag'
subprocess.run(['adb', '-s', S, 'shell', 'uiautomator', 'dump', '/sdcard/ui.xml'], capture_output=True)
subprocess.run(['adb', '-s', S, 'pull', '/sdcard/ui.xml', BASE + '/ui.xml'], capture_output=True)
x = open(BASE + '/ui.xml', encoding='utf-8').read()
for n in re.findall(r'<node[^>]*>', x):
    t = re.search(r'text="([^"]*)"', n)
    d = re.search(r'content-desc="([^"]*)"', n)
    b = re.search(r'bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"', n)
    clk = 'clickable="true"' in n
    lab = (t.group(1) if t else '') or (d.group(1) if d else '')
    if lab.strip() or clk:
        g = b.groups() if b else None
        cx = cy = ''
        if g:
            cx = (int(g[0]) + int(g[2])) // 2
            cy = (int(g[1]) + int(g[3])) // 2
        print(f"{lab!r:52} clk={clk} center=({cx},{cy})")
