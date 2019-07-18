import sys
import xml.etree.ElementTree as etree


def get_attr_number(node):
    tagcounter = 0
    for tags in node.iter():
        tagcounter = tagcounter+len(tags.attrib)
    return tagcounter


if __name__ == '__main__':
    sys.stdin.readline()
    xml = sys.stdin.read()
    tree = etree.ElementTree(etree.fromstring(xml))
    root = tree.getroot()
    print(get_attr_number(root))
